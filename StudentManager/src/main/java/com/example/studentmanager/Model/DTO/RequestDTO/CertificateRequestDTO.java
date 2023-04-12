package com.example.studentmanager.Model.DTO.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CertificateRequestDTO {
  private String certificate_name;
  private String date_graded;
}
