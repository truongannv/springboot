package com.example.studentmanager.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Certificate")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String certificate_name;
    private String date_graded;

    @ManyToMany
    @JoinTable(
      name = "student_certificate",
      joinColumns = @JoinColumn(name = "certificate_id"),
      inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;
}
