package edu.icet.ecom.service;

import edu.icet.ecom.dto.StudentDto;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDto studentDto);
    void updateStudent(StudentDto studentDto);
    void deleteStudent(Long id);
    StudentDto searchByID(Long id);
    List<StudentDto> getAll();
}
