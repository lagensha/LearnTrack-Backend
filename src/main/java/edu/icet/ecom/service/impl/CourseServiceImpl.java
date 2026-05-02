package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.CourseDto;
import edu.icet.ecom.entity.CourseEntity;
import edu.icet.ecom.repository.CourseRepository;
import edu.icet.ecom.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    final CourseRepository courseRepository;
    final ModelMapper modelMapper;
    @Override
    public void addCourse(CourseDto courseDto) {
        CourseEntity courseEntity = modelMapper.map(courseDto, CourseEntity.class);
        courseRepository.save(courseEntity);
    }

    @Override
    public void updateCourse(CourseDto courseDto) {
        CourseEntity courseEntity = modelMapper.map(courseDto, CourseEntity.class);
        courseRepository.save(courseEntity);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public CourseDto searchByID(Long id) {
      CourseEntity courseEntity = courseRepository.findById(id).get();
        CourseDto courseDto = modelMapper.map(courseEntity, CourseDto.class);
        return courseDto;
    }

    @Override
    public List<CourseDto> getAll() {
        return List.of();
    }
}
