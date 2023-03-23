package com.example.studentmanager.Model.DTO.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentRequestDTO {
  private String address;
  private int age;
  private String name;
  private String docID;
}
