package edu.icet.ecom.service;

import edu.icet.ecom.dto.CourseDto;
import edu.icet.ecom.dto.StudentDto;

import java.util.List;

public interface CourseService {
    void addCourse(CourseDto courseDto);
    void updateCourse(CourseDto courseDto);
    void deleteCourse(Long id);
    CourseDto searchByID(Long id);
    List<CourseDto> getAll();
}
