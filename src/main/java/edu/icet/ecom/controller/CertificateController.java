package edu.icet.ecom.controller;

import edu.icet.ecom.dto.CertificateDto;
import edu.icet.ecom.service.CertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/certificate")
@RestController
public class CertificateController{

    final CertificateService certificateService;

    @PostMapping("/add")
    public void addCertificate(@RequestBody CertificateDto certificateDto) {
        certificateService.addCertificate(certificateDto);
    }


    public void updateCertificate(CertificateDto certificateDto) {

    }


    public void deleteCertificate(Long id) {

    }


    public CertificateDto searchByID(Long id) {
        return null;
    }


    public List<CertificateDto> getAll() {
        return List.of();
    }
}
