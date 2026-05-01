package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.StudentDto;
import edu.icet.ecom.entity.StudentEntity;
import edu.icet.ecom.repository.StudentRepository;
import edu.icet.ecom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public StudentDto searchByID(Long id) {
        StudentEntity studentEntity = studentRepository.findById(id).get();
        StudentDto studentDto = modelMapper.map(studentEntity, StudentDto.class);
        return studentDto;
    }

    @Override
    public List<StudentDto> getAll() {
         List<StudentEntity> studentEntities = studentRepository.findAll();
        ArrayList<StudentDto> studentDtos = new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDto studentDto = modelMapper.map(studentEntity, StudentDto.class);
            studentDtos.add(studentDto);
        });
        return studentDtos;
    }
}
