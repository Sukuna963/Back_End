package one.digitalinnovation.academia_digital.controller;

import jakarta.validation.Valid;
import one.digitalinnovation.academia_digital.form.MemberForm;
import one.digitalinnovation.academia_digital.form.MemberUpdateForm;
import one.digitalinnovation.academia_digital.model.Member;
import one.digitalinnovation.academia_digital.model.PhysicalAssessment;
import one.digitalinnovation.academia_digital.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    @Autowired
    private MemberServiceImpl memberService;

    @PostMapping
    public Member create(@Valid @RequestBody MemberForm memberForm) {
        return memberService.create(memberForm);
    }

    @GetMapping("/{id}")
    public Member getById(@PathVariable Long id) {
        return memberService.getById(id);
    }

    @GetMapping
    public List<Member> getAllOrDateOfBirth(@RequestParam(value = "dateOfBirth", required = false) String dateOfBirth) {
        return memberService.getAllOrDateOfBirth(dateOfBirth);
    }

    @PutMapping("/{id}")
    public Member update(@PathVariable Long id, @RequestBody MemberUpdateForm memberUpdateForm) {
        return memberService.update(id, memberUpdateForm);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Member> delete(@PathVariable Long id) {
        memberService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/assessments/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessmentId(@PathVariable Long id) {
        return memberService.getPhysicalAssessment(id);
    }
}
