package com.example.studentmanager.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "student_detail")
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int student_id;
    private int phone_number;
    private String farther_name;
    private String morther_name;
    private int farther_number;
    private int morther_number;

    @OneToOne(mappedBy = "studentDetail")
    private Student student;

    @ManyToMany
    private List<Certificate> certificates;
}
