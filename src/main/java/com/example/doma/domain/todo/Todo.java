package com.example.doma.domain.todo;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

import java.util.Date;

// application.propertiesの「doma.naming」で指定済みなので不要
//@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Data
@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id;

  private String name;

  private Date createTimestamp;

  private Date updateTimestamp;
}
