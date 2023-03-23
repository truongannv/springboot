package com.example.studentmanager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseObject {
  private int status;
  private String message;
  private Object data;
}
