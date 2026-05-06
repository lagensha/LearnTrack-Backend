package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.EnrollmentsDto;
import edu.icet.ecom.entity.EnrollmentsEntity;
import edu.icet.ecom.repository.EnrollmentsRepository;
import edu.icet.ecom.service.EnrollmentsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EnrollmentsServiceImpl implements EnrollmentsService {

    final EnrollmentsRepository enrollmentsRepository;
    final ModelMapper modelMapper;

    @Override
    public void addEnrollment(EnrollmentsDto enrollmentsDto) {
        EnrollmentsEntity enrollmentsEntity = modelMapper.map(enrollmentsDto, EnrollmentsEntity.class);
        enrollmentsRepository.save(enrollmentsEntity);
    }

    @Override
    public void updateEnrollment(EnrollmentsDto enrollmentsDto) {
        EnrollmentsEntity enrollmentsEntity = modelMapper.map(enrollmentsDto, EnrollmentsEntity.class);
        enrollmentsRepository.save(enrollmentsEntity);
    }

    @Override
    public void deleteEnrollment(Long id) {
        enrollmentsRepository.deleteById(id);
    }

    @Override
    public EnrollmentsDto searchByID(Long id) {
        EnrollmentsEntity enrollmentsEntity = enrollmentsRepository.findById(id).get();
        EnrollmentsDto enrollmentsDto = modelMapper.map(enrollmentsEntity, EnrollmentsDto.class);
        return enrollmentsDto;
    }

    @Override
    public List<EnrollmentsDto> getAll() {
        List<EnrollmentsEntity>enrollmentsEntities=enrollmentsRepository.findAll();
        ArrayList<EnrollmentsDto>enrollmentsDtos=new ArrayList<>();
        enrollmentsEntities.forEach(enrollmentsEntity -> {
            EnrollmentsDto enrollmentsDto = modelMapper.map(enrollmentsEntity,EnrollmentsDto.class);
            enrollmentsDtos.add(enrollmentsDto);
        });
        return enrollmentsDtos;
    }
}
