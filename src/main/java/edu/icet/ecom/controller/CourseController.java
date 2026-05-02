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

@GetMapping("/search/{id}")
    public CourseDto searchByID(@PathVariable Long id) {
        return courseService.searchByID(id);
    }

@GetMapping("/getAll")
    public List<CourseDto> getAll() {
        return courseService.getAll();
    }
}
