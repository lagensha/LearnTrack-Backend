package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.StudentDto;
import edu.icet.ecom.entity.StudentEntity;
import edu.icet.ecom.repository.StudentRepository;
import edu.icet.ecom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;
    final ModelMapper modelMapper;

    @Override
    public void addStudent(StudentDto studentDto) {
        StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Long id) {
            studentRepository.deleteById(id);
    }

    @Override
    public StudentDto searchByID(String studentId) {
        return null;
    }

    @Override
    public List<StudentDto> getAll() {
        return List.of();
    }
}
