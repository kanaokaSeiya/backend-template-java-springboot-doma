package com.example.doma.application.dto.todo;

import com.example.doma.domain.todo.Todo;
import lombok.Data;

import java.util.List;

@Data
public class TodosDto {
  private List<Todo> todos;

  public TodosDto(List<Todo> _todos) {
    todos = _todos;
  }
}
