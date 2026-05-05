package edu.icet.ecom.dto;

import lombok.Data;


public class EnrollmentsDto {
    private  Long enrollmentId;
    private Long courseId;
    private Long studentId;
    private Data enrollmentDate;
    private boolean status;
    private String grade;
    private String completionDate;
}
