package com.example.studentmanager.Object;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student_Certificate {
    private int Student_id;
    private int Certificate_id;
}
