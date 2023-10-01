package com.example.doma.application.usecase.todo;

import com.example.doma.application.dto.todo.TodoDto;
import com.example.doma.application.dto.todo.TodosDto;
import com.example.doma.application.formDto.todo.TodoFormDto;
import com.example.doma.domain.todo.Todo;
import com.example.doma.infrastructure.dao.todo.TodoDao;
import com.example.doma.presentation.response.todo.TodosResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoUseCaseImpl implements TodoUseCase {
  private final TodoDao todoDao;

  @Override
  public TodosDto getTodos(String name) {
    List<Todo> list = todoDao.findBySearchName(name);
    TodosDto response = new TodosDto(list);
    return response;
  }

  @Override
  public TodoDto getTodo(int id) {
    Todo todo = todoDao.findByTodo(id);
    TodoDto response = new TodoDto(todo.getId(), todo.getName(), todo.getVersion(), todo.getCreateTimestamp(), todo.getUpdateTimestamp());
    return response;
  }

  @Override
  public void saveTodo(TodoFormDto todoFormDto) {
    Todo todo = new Todo();
    todo.setName(todoFormDto.name);
    todo.setCreateTimestamp(new Date());
    todoDao.insert(todo);
  };

  @Override
  public void updateTodo(TodoFormDto todoFormDto, int id) {
    TodoDto todoDto = getTodo(id);
    Todo todo = new Todo();
    todo.setId(todoDto.getId());
    todo.setName(todoFormDto.name);
    todo.setVersion(todoDto.getVersion());
    todo.setCreateTimestamp(todoDto.getCreateTimestamp());
    todo.setUpdateTimestamp(new Date());
    todoDao.update(todo);
  };
}
