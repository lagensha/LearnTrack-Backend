package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.LecturesDto;
import edu.icet.ecom.entity.LecturesEntity;
import edu.icet.ecom.repository.LecturesRepository;
import edu.icet.ecom.service.LecturesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Service
public class LectureServiceImpl implements LecturesService {

    final LecturesRepository lecturesRepository;
    final ModelMapper modelMapper;
    @Override
    public void addLecture(LecturesDto lecturesDto) {
        LecturesEntity lecturesEntity = modelMapper.map(lecturesDto, LecturesEntity.class);
        lecturesRepository.save(lecturesEntity);
    }

    @Override
    public void updateLecture(LecturesDto lecturesDto) {

    }

    @Override
    public void deleteLecture(Long id) {

    }

    @Override
    public LecturesDto searchByID(Long id) {
        return null;
    }
}
