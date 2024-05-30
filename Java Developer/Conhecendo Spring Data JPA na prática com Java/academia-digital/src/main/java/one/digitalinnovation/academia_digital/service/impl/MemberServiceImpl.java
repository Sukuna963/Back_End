package one.digitalinnovation.academia_digital.service.impl;

import one.digitalinnovation.academia_digital.form.MemberForm;
import one.digitalinnovation.academia_digital.form.MemberUpdateForm;
import one.digitalinnovation.academia_digital.infra.utils.JavaTimeUtils;
import one.digitalinnovation.academia_digital.model.Member;
import one.digitalinnovation.academia_digital.model.PhysicalAssessment;
import one.digitalinnovation.academia_digital.repository.MemberRepository;
import one.digitalinnovation.academia_digital.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member create(MemberForm memberForm) {
       Member member = new Member();
       member.setName(memberForm.getName());
       member.setCpf(memberForm.getCpf());
       member.setNeighborhood(memberForm.getNeighborhood());
       member.setDateOfBirth(memberForm.getDateOfBirth());

       return memberRepository.save(member);
    }

    @Override
    public Member getById(Long id) {
        return memberRepository.findById(id).get();
    }

    @Override
    public List<Member> getAllOrDateOfBirth(String dataDeNascimento) {
        if(dataDeNascimento == null) {
            return memberRepository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return memberRepository.findByDateOfBirth(localDate);
        }
    }

    @Override
    public Member update(Long id, MemberUpdateForm memberUpdateForm) {
        Member existeAluno = memberRepository.findById(id).get();
        existeAluno.setName(memberUpdateForm.getName());
        existeAluno.setNeighborhood(memberUpdateForm.getNeighborhood());
        existeAluno.setDateOfBirth(memberUpdateForm.getDateOfBirth());

        return memberRepository.save(existeAluno);
    }

    @Override
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public List<PhysicalAssessment> getPhysicalAssessment(Long id) {
        Member member = memberRepository.findById(id).get();

        return member.getAssessments();
    }
}
