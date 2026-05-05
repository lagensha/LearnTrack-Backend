package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentsDto {
    private  Long enrollmentId;
    private String courseId;
    private String  studentId;
    private LocalDate enrollmentDate;
    private boolean status;
    private String grade;
    private String completionDate;
}
