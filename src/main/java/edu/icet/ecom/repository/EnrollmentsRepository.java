package edu.icet.ecom.repository;

import edu.icet.ecom.entity.EnrollmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentsRepository extends JpaRepository<EnrollmentsEntity, Long> {
}
