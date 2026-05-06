package edu.icet.ecom.controller;

import edu.icet.ecom.dto.CertificateDto;
import edu.icet.ecom.service.CertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


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

@PutMapping("/update")
    public void updateCertificate(@RequestBody CertificateDto certificateDto) {
        certificateService.updateCertificate(certificateDto);
    }

@DeleteMapping("/delete/{id}")
    public void deleteCertificate(@PathVariable Long id) {
        certificateService.deleteCertificate(id);
    }


    public CertificateDto searchByID(Long id) {
        return null;
    }


    public List<CertificateDto> getAll() {
        return List.of();
    }
}
