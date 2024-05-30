package one.digitalinnovation.academia_digital.controller;

import jakarta.validation.Valid;
import one.digitalinnovation.academia_digital.form.EnrollmentForm;
import one.digitalinnovation.academia_digital.model.Enrollment;
import one.digitalinnovation.academia_digital.service.impl.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentServiceImpl enrollmentService;

    @PostMapping
    public Enrollment create(@Valid @RequestBody EnrollmentForm enrollmentForm) {
        return enrollmentService.create(enrollmentForm);
    }

    @GetMapping("/{id}")
    public Enrollment getById(@PathVariable Long id) {
        return enrollmentService.getById(id);
    }

    @GetMapping
    public List<Enrollment> getAllOrNeighborhood(@RequestParam(value = "neighborhood", required = false) String neighborhood) {
        return enrollmentService.getAllOrNeighborhood(neighborhood);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        enrollmentService.delete(id);
    }
}
