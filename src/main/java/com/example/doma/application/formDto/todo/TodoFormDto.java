package com.example.doma.application.formDto.todo;

import lombok.Data;

@Data
public class TodoFormDto {
  public String name;

  public TodoFormDto(String _name) {
    name = _name;
  }
}
