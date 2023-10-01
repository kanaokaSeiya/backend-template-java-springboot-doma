package com.example.doma.application.usecase.todo;

import com.example.doma.application.dto.todo.TodoDto;
import com.example.doma.application.dto.todo.TodosDto;

public interface TodoUseCase {
  TodosDto getTodos();

  TodoDto getTodo(int id);
}
