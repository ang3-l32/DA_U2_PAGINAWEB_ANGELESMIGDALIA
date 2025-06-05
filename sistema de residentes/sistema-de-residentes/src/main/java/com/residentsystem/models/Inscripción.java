package com.residentsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long courseId;
    private String fullName;
    private LocalDate inscriptionDate;
    private String status;
    private String conditions;
    private Long userId;
    private LocalDateTime createdAt;
}