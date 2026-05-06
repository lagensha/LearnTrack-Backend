package edu.icet.ecom.service;

import edu.icet.ecom.dto.CertificateDto;

import java.util.List;

public interface CertificateService {
    void addCertificate(CertificateDto certificateDto);
    void updateCertificate(CertificateDto certificateDto);
    void deleteCertificate(Long id);
    CertificateDto searchByID(Long id);
    List<CertificateDto> getAll();

}
