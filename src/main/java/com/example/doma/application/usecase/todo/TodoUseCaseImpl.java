package com.example.doma.application.usecase.todo;

import com.example.doma.application.dto.todo.TodoDto;
import com.example.doma.application.dto.todo.TodosDto;
import com.example.doma.domain.todo.Todo;
import com.example.doma.infrastructure.dao.todo.TodoDao;
import com.example.doma.presentation.response.todo.TodosResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoUseCaseImpl implements TodoUseCase {
  private final TodoDao todoDao;

  @Override
  public TodosDto getTodos() {
    List<Todo> list = todoDao.findAll();
    TodosDto response = new TodosDto(list);
    return response;
  }

  @Override
  public TodoDto getTodo(int id) {
    Todo todo = todoDao.findByTodo(id);
    TodoDto response = new TodoDto(todo.getId(), todo.getName(), todo.getCreateTimestamp(), todo.getUpdateTimestamp());
    return response;
  }
}