package com.residentsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Entity
@Data
public class Incidence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDate date;
    private LocalTime time;
    private String status;
    private Long userId;
    private LocalDateTime createdAt;
}