package one.digitalinnovation.academia_digital.controller;

import jakarta.validation.Valid;
import one.digitalinnovation.academia_digital.form.PhysicalAssessmentForm;
import one.digitalinnovation.academia_digital.form.PhysicalAssessmentUpdateForm;
import one.digitalinnovation.academia_digital.model.Member;
import one.digitalinnovation.academia_digital.model.PhysicalAssessment;
import one.digitalinnovation.academia_digital.service.impl.PhysicalAssessmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/assessments")
public class PhysicalAssessmentController {

    @Autowired
    private PhysicalAssessmentServiceImpl physicalAssessmentService;

    @PostMapping
    public PhysicalAssessment create(@Valid @RequestBody PhysicalAssessmentForm physicalAssessmentForm) {
        return physicalAssessmentService.create(physicalAssessmentForm);
    }

    @GetMapping("/{id}")
    public PhysicalAssessment getById(@PathVariable Long id) {
        return physicalAssessmentService.getById(id);
    }

    @GetMapping
    public List<PhysicalAssessment> getAll() {
        return physicalAssessmentService.getAll();
    }

    @PutMapping("/{id}")
    public PhysicalAssessment update(@PathVariable Long id, @RequestBody PhysicalAssessmentUpdateForm physicalAssessmentUpdateForm) {
        return physicalAssessmentService.update(id, physicalAssessmentUpdateForm);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Member> delete(@PathVariable Long id) {
        physicalAssessmentService.delete(id);
        return ResponseEntity.ok().build();
    }
}
