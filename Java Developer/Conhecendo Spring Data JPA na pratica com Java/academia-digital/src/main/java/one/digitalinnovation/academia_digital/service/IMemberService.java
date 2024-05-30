package one.digitalinnovation.academia_digital.service;

import one.digitalinnovation.academia_digital.form.MemberForm;
import one.digitalinnovation.academia_digital.form.MemberUpdateForm;
import one.digitalinnovation.academia_digital.model.Member;
import one.digitalinnovation.academia_digital.model.PhysicalAssessment;

import java.util.List;

public interface IMemberService {
    Member create(MemberForm memberForm);
    Member getById(Long id);
    List<Member> getAllOrDateOfBirth(String dateOfBirth);
    Member update(Long id, MemberUpdateForm memberUpdateForm);
    void delete(Long id);
    List<PhysicalAssessment> getPhysicalAssessment(Long id);
}