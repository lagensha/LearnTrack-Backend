package edu.icet.ecom.controller;

import edu.icet.ecom.dto.CourseDto;
import edu.icet.ecom.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/course")
public class CourseController{

    final CourseService courseService;

    @PostMapping("/add")
    public void addCourse(@RequestBody CourseDto courseDto) {
        courseService.addCourse(courseDto);
    }


    public void updateCourse(CourseDto courseDto) {

    }


    public void deleteCourse(Long id) {

    }


    public CourseDto searchByID(Long id) {
        return null;
    }


    public List<CourseDto> getAll() {
        return List.of();
    }
}
