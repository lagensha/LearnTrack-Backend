package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.LecturesDto;
import edu.icet.ecom.entity.LecturesEntity;
import edu.icet.ecom.repository.LecturesRepository;
import edu.icet.ecom.service.LecturesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


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
        LecturesEntity lecturesEntity = modelMapper.map(lecturesDto,LecturesEntity.class);
        lecturesRepository.save(lecturesEntity);
    }

    @Override
    public void deleteLecture(Long id) {
        lecturesRepository.deleteById(id);
    }

    @Override
    public LecturesDto searchByID(Long id) {
        LecturesEntity lecturesEntity = lecturesRepository.findById(id).get();
        LecturesDto lecturesDto = modelMapper.map(lecturesEntity, LecturesDto.class);
        return lecturesDto;
    }

    @Override
    public List<LecturesDto> getAll() {
      List<LecturesEntity>lecturesEntities=lecturesRepository.findAll();
        ArrayList<LecturesDto>lecturesDtos=new ArrayList<>();
        lecturesEntities.forEach(lecturesEntity -> {
            LecturesDto lecturesDto = modelMapper.map(lecturesEntity, LecturesDto.class);
            lecturesDtos.add(lecturesDto);
        });
        return lecturesDtos;
        }
    }

