package edu.icet.ecom.repository;

import edu.icet.ecom.entity.CertificateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<CertificateEntity, Long> {
}
