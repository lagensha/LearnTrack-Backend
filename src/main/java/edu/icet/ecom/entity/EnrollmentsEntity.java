package edu.icet.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EnrollmentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long enrollmentId;
    private String courseId;
    private String studentId;
    private LocalDate enrollmentDate;
    private boolean status;
    private String grade;
    private String completionDate;
}
