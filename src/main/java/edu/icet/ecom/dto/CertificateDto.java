package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateDto {
    private Long id;
    private String name;
    private String description;
    private String studentId;
    private String courseId;
}
