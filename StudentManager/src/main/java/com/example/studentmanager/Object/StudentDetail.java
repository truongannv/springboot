package com.example.studentmanager.Object;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "student_detail")
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long student_id;
    private int phone_number;
    private String farther_name;
    private String morther_name;
    private int farther_number;
    private int morther_number;
}
