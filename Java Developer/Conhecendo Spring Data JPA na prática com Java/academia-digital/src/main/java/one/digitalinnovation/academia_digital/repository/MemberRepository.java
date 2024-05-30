package one.digitalinnovation.academia_digital.repository;

import one.digitalinnovation.academia_digital.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByDateOfBirth(LocalDate dateOfBirth);
}
