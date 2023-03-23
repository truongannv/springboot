package com.example.studentmanager.Model.DTO.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentResponseDTO {
  private String address;
  private int age;
  private String name;
  private String docID;
}
