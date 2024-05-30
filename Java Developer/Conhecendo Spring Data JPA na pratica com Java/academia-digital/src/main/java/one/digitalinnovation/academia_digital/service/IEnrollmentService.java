package one.digitalinnovation.academia_digital.service;

import one.digitalinnovation.academia_digital.form.EnrollmentForm;
import one.digitalinnovation.academia_digital.model.Enrollment;
import one.digitalinnovation.academia_digital.model.Member;

import java.util.List;

public interface IEnrollmentService {

    Enrollment create(EnrollmentForm enrollmentFormForm);
    Enrollment getById(Long id);
    List<Enrollment> getAllOrNeighborhood(String neighborhood);
    void delete(Long id);
}
