package com.example.doma.presentation.controller.todo;

import com.example.doma.application.dto.todo.TodoDto;
import com.example.doma.application.dto.todo.TodosDto;
import com.example.doma.application.formDto.todo.TodoFormDto;
import com.example.doma.application.usecase.todo.TodoUseCase;
import com.example.doma.infrastructure.dao.todo.TodoDao;
import com.example.doma.presentation.form.todo.TodoForm;
import com.example.doma.presentation.response.todo.TodoResponse;
import com.example.doma.presentation.response.todo.TodosResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TodoControllerImpl implements TodoController {
  private final TodoDao todoDao;
  private final TodoUseCase todoUseCase;

  @Override
  @GetMapping("todos")
  public TodosResponse getTodos(@RequestParam(name = "name", required = false) String name) {
    TodosDto list = todoUseCase.getTodos(name);
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

  @Override
  @PostMapping("/todo")
  public void saveTodo(TodoForm todoForm) {
    TodoFormDto todoFormDto = new TodoFormDto(todoForm.getName());
    todoUseCase.saveTodo(todoFormDto);
  };

  @Override
  @PutMapping("/todo/{id}")
  public void updateTodo(TodoForm todoForm, @PathVariable int id) {
    TodoFormDto todoFormDto = new TodoFormDto(todoForm.getName());
    todoUseCase.updateTodo(todoFormDto, id);
  };
}
