package com.example.studentmanager.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "student_detail")
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int student_id;
    private String phone_number;
    private String farther_name;
    private String morther_name;
    private String farther_number;
    private String morther_number;

    @OneToOne(mappedBy = "studentDetail")
    private Student student;

    @ManyToMany
    private List<Certificate> certificates;
}
