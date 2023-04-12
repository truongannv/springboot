package com.example.studentmanager.Model.DTO.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CertificateResponseDTO {
  private String certificate_name;
  private String date_graded;
}
