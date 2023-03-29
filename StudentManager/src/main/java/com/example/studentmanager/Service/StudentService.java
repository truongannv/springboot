package com.example.studentmanager.Service;

import com.example.studentmanager.Model.DTO.RequestDTO.StudentDetailRequestDTO;
import com.example.studentmanager.Model.DTO.RequestDTO.StudentRequestDTO;
import com.example.studentmanager.Model.DTO.ResponseDTO.StudentResponseDTO;
import com.example.studentmanager.Model.ResponseObject;
import com.example.studentmanager.Model.Student;
import com.example.studentmanager.Model.StudentDetail;
import com.example.studentmanager.Repository.StudentDetailRepository;
import com.example.studentmanager.Repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService {

  @Autowired
  private StudentDetailRepository studentDetailRepository;

  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private ModelMapper mapper;

  @Override
  public ResponseObject listAllStudent() {
    try {
      List<Student> studentList = studentRepository.findAll();
      if(studentList.isEmpty()){
        return new ResponseObject(200,"danh sách rỗng",null);
      }
      List<StudentResponseDTO> studentResponseDTOS = new ArrayList<>();
      for(Student student : studentList){
        StudentResponseDTO studentResponseDTO = mapper.map(student, StudentResponseDTO.class);
        studentResponseDTOS.add(studentResponseDTO);
      }
      return new ResponseObject(200,"Thành công",studentResponseDTOS);
    }catch (Exception e){
      return new ResponseObject(500,"Xảy ra lỗi",null);
    }
  }

  @Override
  public ResponseObject addStudent(StudentRequestDTO studentRequestDTO) {
    Student student1 = mapper.map(studentRequestDTO,Student.class);
    studentRepository.save(student1);
    return new ResponseObject(200,"Thêm thành công",studentRequestDTO);
  }

  @Override
  public ResponseObject updateStudent(int id,StudentRequestDTO studentRequestDTO) {
    Student student = mapper.map(studentRequestDTO,Student.class);
    Student student1 = studentRepository.findById(id).orElse(null);
    if(student1 == null){
      return new ResponseObject(500,"không tìm thấy sinh viên cần sửa",null);
    }else{
      student.setId(student.getId());
      student.setAge(student.getAge());
      student.setAddress(student.getAddress());
      student.setName(student.getName());
      student.setDocID(student.getDocID());
      return new ResponseObject(200,"Cập nhật thành công",studentRequestDTO);
    }
  }

  @Override
  public ResponseObject deleteStudent(int id) {
    Student student = studentRepository.findById(id).orElse(null);
    if(student==null){
      return new ResponseObject(400,"Không tìm thấy sinh viên",null);
    }else{
      studentRepository.deleteById(id);
      return new ResponseObject(200,"Xóa thành công",student);
    }
  }

  @Override
  public ResponseObject findStudent(int student_id){
    StudentDetail studentDetail = studentDetailRepository.findById(student_id).orElse(null);
    if(studentDetail == null){
      return new ResponseObject(400,"sinh viên chưa có thông tin",null);
    }else{
      return new ResponseObject(200,"Thành công",studentDetail);
    }
  }

  @Override
  public ResponseObject addDetail(StudentDetailRequestDTO studentDetailRequestDTO){
    StudentDetail studentDetail = mapper.map(studentDetailRequestDTO,StudentDetail.class);
    studentDetailRepository.save(studentDetail);
    return new ResponseObject(200,"Thêm thành công",studentDetailRequestDTO);
  }
}
