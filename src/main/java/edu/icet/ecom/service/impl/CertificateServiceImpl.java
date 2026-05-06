package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.CertificateDto;
import edu.icet.ecom.entity.CertificateEntity;
import edu.icet.ecom.repository.CertificateRepository;
import edu.icet.ecom.service.CertificateService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        CertificateEntity certificateEntity =modelMapper.map(certificateDto,CertificateEntity.class);
        certificateRepository.save(certificateEntity);
    }

    @Override
    public void deleteCertificate(Long id) {
        certificateRepository.deleteById(id);
    }

    @Override
    public CertificateDto searchByID(Long id) {
         CertificateEntity certificateEntity=certificateRepository.findById(id).get();
            CertificateDto certificateDto=modelMapper.map(certificateEntity,CertificateDto.class);
            return certificateDto;
    }

    @Override
    public List<CertificateDto> getAll() {
        List<CertificateEntity> certificateEntities=certificateRepository.findAll();
        ArrayList<CertificateDto>certificateDtos=new ArrayList<>();
        certificateEntities.forEach(certificateEntity -> {
            CertificateDto certificateDto=modelMapper.map(certificateEntity,CertificateDto.class);
            certificateDtos.add(certificateDto);
        });
        return certificateDtos;
    }
}
