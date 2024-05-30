package one.digitalinnovation.academia_digital.service.impl;

import one.digitalinnovation.academia_digital.form.EnrollmentForm;
import one.digitalinnovation.academia_digital.model.Enrollment;
import one.digitalinnovation.academia_digital.model.Member;
import one.digitalinnovation.academia_digital.repository.MemberRepository;
import one.digitalinnovation.academia_digital.repository.EnrollmentRepository;
import one.digitalinnovation.academia_digital.service.IEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements IEnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Enrollment create(EnrollmentForm enrollmentForm) {
        Enrollment enrollment = new Enrollment();
        Member member = memberRepository.findById(enrollmentForm.getMemberId()).get();

        enrollment.setMember(member);

        return enrollmentRepository.save(enrollment);
    }

    @Override
    public Enrollment getById(Long id) {
        return enrollmentRepository.findById(id).get();
    }

    @Override
    public List<Enrollment> getAllOrNeighborhood(String neighborhood) {
        if(neighborhood == null) {
            return enrollmentRepository.findAll();
        } else {
            return enrollmentRepository.findByMemberNeighborhood(neighborhood);
        }
    }

    @Override
    public void delete(Long id) {
        enrollmentRepository.deleteById(id);
    }
}
