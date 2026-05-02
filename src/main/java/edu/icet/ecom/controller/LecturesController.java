package edu.icet.ecom.controller;

import edu.icet.ecom.dto.LecturesDto;
import edu.icet.ecom.service.LecturesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lectures")
@RequiredArgsConstructor
public class LecturesController  {

    final LecturesService lecturesService;

    @PostMapping("/add")
    public void addLecture(@RequestBody LecturesDto lecturesDto) {
        lecturesService.addLecture(lecturesDto);
    }


    public void updateLecture(LecturesDto lecturesDto) {

    }


    public void deleteLecture(Long id) {

    }


    public LecturesDto searchByID(Long id) {
        return null;
    }
}
