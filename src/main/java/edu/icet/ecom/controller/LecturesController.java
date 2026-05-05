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
    public void deleteLecture( @PathVariable Long id) {
        lecturesService.deleteLecture(id);
    }

@GetMapping("/search/{id}")
    public LecturesDto searchByID(@PathVariable Long id) {
      return lecturesService.searchByID(id);
    }
@GetMapping("/getAll")
    public List<LecturesDto> getAll() {
        return lecturesService.getAll();
    }
}
