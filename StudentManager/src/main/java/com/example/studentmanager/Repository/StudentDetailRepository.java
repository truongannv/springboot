package com.example.studentmanager.Repository;

import com.example.studentmanager.Model.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailRepository extends JpaRepository<StudentDetail, Integer> {
}
