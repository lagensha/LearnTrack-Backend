package edu.icet.ecom.controller;

import edu.icet.ecom.dto.EnrollmentsDto;
import edu.icet.ecom.service.EnrollmentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


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

@PutMapping("/update")
    public void updateEnrollment(@RequestBody EnrollmentsDto enrollmentsDto) {
        enrollmentsService.updateEnrollment(enrollmentsDto);
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
