package com.example.studentmanager.Model.DTO.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDetailRequestDTO {
  private long student_id;
  private int phone_number;
  private String farther_name;
  private String morther_name;
  private int farther_number;
  private int morther_number;
}
