package com.example.studentmanager.Controller;

import com.example.studentmanager.Model.DTO.RequestDTO.StudentRequestDTO;
import com.example.studentmanager.Model.ResponseObject;
import com.example.studentmanager.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentService studentService;

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
}
