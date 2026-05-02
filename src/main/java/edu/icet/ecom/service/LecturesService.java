package edu.icet.ecom.service;

import edu.icet.ecom.dto.LecturesDto;

import java.util.List;

public interface LecturesService {
    void addLecture(LecturesDto lecturesDto);
    void updateLecture(LecturesDto lecturesDto);
    void deleteLecture(Long id);
    LecturesDto searchByID(Long id);
    List<LecturesDto> getAll();

}
