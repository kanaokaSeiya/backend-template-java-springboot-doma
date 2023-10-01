package com.example.doma.presentation.controller.todo;

import com.example.doma.presentation.form.todo.TodoForm;
import com.example.doma.presentation.response.todo.TodoResponse;
import com.example.doma.presentation.response.todo.TodosResponse;

interface TodoController {
  TodosResponse getTodos();

  TodoResponse getTodo(int id);

  void saveTodo(TodoForm todoForm);

  void updateTodo(TodoForm todoForm, int id);
}
