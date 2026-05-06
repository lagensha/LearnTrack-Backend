package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.CertificateDto;
import edu.icet.ecom.entity.CertificateEntity;
import edu.icet.ecom.repository.CertificateRepository;
import edu.icet.ecom.service.CertificateService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CertificateServiceImpl implements CertificateService {
    final CertificateRepository certificateRepository;
    final ModelMapper modelMapper;

    @Override
    public void addCertificate(CertificateDto certificateDto) {
        CertificateEntity certificateEntity=modelMapper.map(certificateDto,CertificateEntity.class);
        certificateRepository.save(certificateEntity);
    }

    @Override
    public void updateCertificate(CertificateDto certificateDto) {

    }

    @Override
    public void deleteCertificate(Long id) {

    }

    @Override
    public CertificateDto searchByID(Long id) {
        return null;
    }

    @Override
    public List<CertificateDto> getAll() {
        return null;
    }
}
