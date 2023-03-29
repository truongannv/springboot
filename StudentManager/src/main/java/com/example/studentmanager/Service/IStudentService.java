package com.example.studentmanager.Service;

import com.example.studentmanager.Model.DTO.RequestDTO.StudentDetailRequestDTO;
import com.example.studentmanager.Model.DTO.RequestDTO.StudentRequestDTO;
import com.example.studentmanager.Model.ResponseObject;
import com.example.studentmanager.Model.Student;
import org.springframework.http.ResponseEntity;

public interface IStudentService {
  ResponseObject listAllStudent();
  ResponseObject addStudent(StudentRequestDTO studentRequestDTO);
  ResponseObject updateStudent(int id, StudentRequestDTO studentRequestDTO);
  ResponseObject deleteStudent(int id);
  ResponseObject findStudent(int student_id);
  ResponseObject addDetail(StudentDetailRequestDTO studentDetailRequestDTO);
}
