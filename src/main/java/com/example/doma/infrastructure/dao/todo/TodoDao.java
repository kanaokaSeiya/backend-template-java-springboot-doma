package com.example.doma.infrastructure.dao.todo;

import com.example.doma.domain.todo.Todo;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface TodoDao {
  @Select
  List<Todo> findAll();

  @Select
  Todo findByTodo(int id);

  @Insert
  int insert(Todo todo);

  @Update
  int update(Todo todo);
}
