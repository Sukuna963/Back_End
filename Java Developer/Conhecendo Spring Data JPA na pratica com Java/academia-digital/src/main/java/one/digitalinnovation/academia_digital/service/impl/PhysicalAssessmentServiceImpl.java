package one.digitalinnovation.academia_digital.service.impl;

import one.digitalinnovation.academia_digital.form.PhysicalAssessmentForm;
import one.digitalinnovation.academia_digital.form.PhysicalAssessmentUpdateForm;
import one.digitalinnovation.academia_digital.model.Member;
import one.digitalinnovation.academia_digital.model.PhysicalAssessment;
import one.digitalinnovation.academia_digital.repository.MemberRepository;
import one.digitalinnovation.academia_digital.repository.PhysicalAssessmentRepository;
import one.digitalinnovation.academia_digital.service.IPhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessmentService {

    @Autowired
    private PhysicalAssessmentRepository physicalAssessmentRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public PhysicalAssessment create(PhysicalAssessmentForm physicalAssessmentForm) {
        PhysicalAssessment physicalAssessment = new PhysicalAssessment();
        Member member = memberRepository.findById(physicalAssessmentForm.getMemberId()).get();

        physicalAssessment.setMember(member);
        physicalAssessment.setHeight(physicalAssessmentForm.getHeight());
        physicalAssessment.setWeight(physicalAssessmentForm.getWeight());

        return physicalAssessmentRepository.save(physicalAssessment);
    }

    @Override
    public PhysicalAssessment getById(Long id) {
        return physicalAssessmentRepository.findById(id).get();
    }

    @Override
    public List<PhysicalAssessment> getAll() {
        return physicalAssessmentRepository.findAll();
    }

    @Override
    public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm physicalAssessmentUpdateForm) {
        PhysicalAssessment physicalAssessmentExists = physicalAssessmentRepository.findById(id).get();
        physicalAssessmentExists.setHeight(physicalAssessmentUpdateForm.getHeight());
        physicalAssessmentExists.setWeight(physicalAssessmentUpdateForm.getWeight());

        return physicalAssessmentRepository.save(physicalAssessmentExists);
    }

    @Override
    public void delete(Long id) {
        physicalAssessmentRepository.deleteById(id);
    }
}
