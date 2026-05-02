package edu.icet.ecom.service;

import edu.icet.ecom.dto.LecturesDto;

public interface LecturesService {
    void addLecture(LecturesDto lecturesDto);
    void updateLecture(LecturesDto lecturesDto);
    void deleteLecture(Long id);
    LecturesDto searchByID(Long id);
}
