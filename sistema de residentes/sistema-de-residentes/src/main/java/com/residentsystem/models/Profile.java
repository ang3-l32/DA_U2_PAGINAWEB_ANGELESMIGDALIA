package com.residentsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String career;
    private String semester;
    private String status;
    private String role;
    private String photoUrl;
}