package com.example.studentmanager.Repository;

import com.example.studentmanager.Model.DTO.ResponseDTO.StudentResponseDTO;
import com.example.studentmanager.Model.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail, Integer> {

  @Query(value = "SELECT u FROM StudentDetail u WHERE u.student_id = :student_id")
  StudentDetail findStudentDetailByStudentID(int student_id);
}
