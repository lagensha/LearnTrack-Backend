package edu.icet.ecom.controller;

import edu.icet.ecom.dto.StudentDto;
import edu.icet.ecom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    final StudentService studentService;

    @PostMapping("/add")
    public void addStudent(StudentDto studentDto) {
        studentService.addStudent(studentDto);
    }


    public void updateStudent(StudentDto studentDto) {

    }


    public void deleteStudent(String studentId) {

    }


    public StudentDto searchByID(String studentId) {
        return null;
    }


    public List<StudentDto> getAll() {
        return List.of();
    }
}
