package edu.icet.ecom.controller;

import edu.icet.ecom.dto.StudentDto;
import edu.icet.ecom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    final StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDto studentDto) {
        studentService.addStudent(studentDto);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDto studentDto) {
        studentService.updateStudent(studentDto);
    }

@DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

@GetMapping("/search/{id}")
    public StudentDto searchByID(@PathVariable Long id) {
        return studentService.searchByID(id);
    }


    public List<StudentDto> getAll() {
        return List.of();
    }
}
