package edu.icet.ecom.controller;

import edu.icet.ecom.dto.LecturesDto;
import edu.icet.ecom.service.LecturesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lectures")
@RequiredArgsConstructor
public class LecturesController  {

    final LecturesService lecturesService;

    @PostMapping("/add")
    public void addLecture(@RequestBody LecturesDto lecturesDto) {
        lecturesService.addLecture(lecturesDto);
    }

@PutMapping("/update")
    public void updateLecture(@RequestBody LecturesDto lecturesDto) {
        lecturesService.updateLecture(lecturesDto);
    }

@DeleteMapping("/delete/{id}")
    public void deleteLecture(Long id) {
        lecturesService.deleteLecture(id);
    }


    public LecturesDto searchByID(Long id) {
        return null;
    }

    public List<LecturesDto> getAll() {
        return null;
    }
}
