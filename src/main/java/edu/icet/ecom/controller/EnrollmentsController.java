package edu.icet.ecom.controller;

import edu.icet.ecom.dto.EnrollmentsDto;
import edu.icet.ecom.service.EnrollmentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/v1/enrollments")
@RequiredArgsConstructor
public class EnrollmentsController {

    final private EnrollmentsService enrollmentsService;

    @PostMapping("/add")
    public void addEnrollment(@RequestBody EnrollmentsDto enrollmentsDto) {
        enrollmentsService.addEnrollment(enrollmentsDto);
    }


    public void updateEnrollment(EnrollmentsDto enrollmentsDto) {

    }

    public void deleteEnrollment(Long id) {

    }


    public EnrollmentsDto searchByID(Long id) {
        return null;
    }


    public List<EnrollmentsDto> getAll() {
        return null;
    }
}
