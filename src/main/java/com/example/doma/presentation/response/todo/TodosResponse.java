package com.example.doma.presentation.response.todo;

import com.example.doma.application.dto.todo.TodosDto;
import lombok.Data;

import java.util.Date;

@Data
public class TodosResponse {
  private TodosDto todosResponse;

  public TodosResponse(TodosDto todosDto) {
    todosResponse = todosDto;
  }
}
