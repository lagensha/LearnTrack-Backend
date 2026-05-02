package edu.icet.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LecturesEntity {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String courseId;
}
