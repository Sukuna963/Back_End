package one.digitalinnovation.academia_digital.repository;

import one.digitalinnovation.academia_digital.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findByMemberNeighborhood(String neighborhood);
}
