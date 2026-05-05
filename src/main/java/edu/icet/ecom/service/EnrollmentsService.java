package edu.icet.ecom.service;

import edu.icet.ecom.dto.EnrollmentsDto;

import java.util.List;

public interface EnrollmentsService {
    void addEnrollment(EnrollmentsDto enrollmentsDto);
    void updateEnrollment(EnrollmentsDto enrollmentsDto);
    void deleteEnrollment(Long id);
    EnrollmentsDto searchByID(Long id);
    List<EnrollmentsDto> getAll();
}
