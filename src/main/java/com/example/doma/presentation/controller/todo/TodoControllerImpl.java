package com.example.doma.presentation.controller.todo;

import com.example.doma.application.dto.todo.TodoDto;
import com.example.doma.application.dto.todo.TodosDto;
import com.example.doma.application.usecase.todo.TodoUseCase;
import com.example.doma.infrastructure.dao.todo.TodoDao;
import com.example.doma.presentation.response.todo.TodoResponse;
import com.example.doma.presentation.response.todo.TodosResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TodoControllerImpl implements TodoController {
  private final TodoDao todoDao;
  private final TodoUseCase todoUseCase;

  @Override
  @GetMapping("todos")
  public TodosResponse getTodos() {
    TodosDto list = todoUseCase.getTodos();
    TodosResponse response = new TodosResponse(list);
    return response;
  }

  @Override
  @GetMapping("todo/{id}")
  public TodoResponse getTodo(@PathVariable int id) {
    TodoDto todo = todoUseCase.getTodo(id);
    TodoResponse response = new TodoResponse(todo.getId(), todo.getName(), todo.getCreateTimestamp(), todo.getUpdateTimestamp());
    return response;
  }
}
