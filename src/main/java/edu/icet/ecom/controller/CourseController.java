package edu.icet.ecom.controller;

import edu.icet.ecom.dto.CourseDto;
import edu.icet.ecom.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


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

@PutMapping("/update")
    public void updateCourse(@RequestBody CourseDto courseDto) {
        courseService.updateCourse(courseDto);
    }

@DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }


    public CourseDto searchByID(Long id) {
        return null;
    }


    public List<CourseDto> getAll() {
        return List.of();
    }
}
