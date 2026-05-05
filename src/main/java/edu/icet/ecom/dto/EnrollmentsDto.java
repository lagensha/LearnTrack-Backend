package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentsDto {
    private  Long enrollmentId;
    private String courseId;
    private String  studentId;
    private Data enrollmentDate;
    private boolean status;
    private String grade;
    private String completionDate;
}
