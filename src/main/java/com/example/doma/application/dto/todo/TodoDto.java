package com.example.doma.application.dto.todo;

import lombok.Data;

import java.util.Date;

@Data
public class TodoDto {
  private int id;
  private String name;
  private Date createTimestamp;
  private Date updateTimestamp;

  public TodoDto(int _id, String _name, Date _createTimestamp, Date _updateTimestamp) {
    id = _id;
    name = _name;
    createTimestamp = _createTimestamp;
    updateTimestamp = _updateTimestamp;
  }
}
