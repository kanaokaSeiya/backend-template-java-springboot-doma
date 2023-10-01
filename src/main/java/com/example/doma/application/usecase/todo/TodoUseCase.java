package com.example.doma.application.usecase.todo;

import com.example.doma.application.dto.todo.TodoDto;
import com.example.doma.application.dto.todo.TodosDto;
import com.example.doma.application.formDto.todo.TodoFormDto;

public interface TodoUseCase {
  TodosDto getTodos();

  TodoDto getTodo(int id);

  void saveTodo(TodoFormDto todoFormDto);

  void updateTodo(TodoFormDto todoFormDto, int id);
}
