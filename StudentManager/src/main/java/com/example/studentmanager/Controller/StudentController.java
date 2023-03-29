package com.example.studentmanager.Controller;

import com.example.studentmanager.Model.DTO.RequestDTO.StudentDetailRequestDTO;
import com.example.studentmanager.Model.DTO.RequestDTO.StudentRequestDTO;
import com.example.studentmanager.Model.ResponseObject;
import com.example.studentmanager.Repository.StudentDetailRepository;
import com.example.studentmanager.Repository.StudentRepository;
import com.example.studentmanager.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentService studentService;
  @Autowired
  private StudentDetailRepository studentDetailRepository;
  @Autowired
  private StudentRepository studentRepository;

  @GetMapping("/list-all")
  public ResponseObject listAllStudent(){
    return studentService.listAllStudent();
  }

  @PutMapping("/add-student")
  public ResponseObject addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
    return studentService.addStudent(studentRequestDTO);
  }

  @PutMapping("/update-student")
  public ResponseObject updateStudent(int id,StudentRequestDTO studentRequestDTO){
    return studentService.updateStudent(id,studentRequestDTO);
  }

  @RequestMapping("/delete-student")
  public ResponseObject deleteStudent(int id){
    return studentService.deleteStudent(id);
  }

  @PutMapping("/add-detail")
  public ResponseObject addDetail(StudentDetailRequestDTO studentDetailRequestDTO){
    return studentService.addDetail(studentDetailRequestDTO);
  }

  @RequestMapping("/list-all/find-student")
  public ResponseObject findStudent(int id){ return studentService.findStudent(id); }
}
