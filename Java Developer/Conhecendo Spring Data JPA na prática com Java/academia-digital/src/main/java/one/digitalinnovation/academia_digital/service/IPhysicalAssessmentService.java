package one.digitalinnovation.academia_digital.service;

import one.digitalinnovation.academia_digital.form.PhysicalAssessmentForm;
import one.digitalinnovation.academia_digital.form.PhysicalAssessmentUpdateForm;
import one.digitalinnovation.academia_digital.model.PhysicalAssessment;

import java.util.List;

public interface IPhysicalAssessmentService {

    PhysicalAssessment create(PhysicalAssessmentForm physicalAssessmentForm);
    PhysicalAssessment getById(Long id);
    List<PhysicalAssessment> getAll();
    PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm physicalAssessmentUpdateForm);
    void delete(Long id);
}
