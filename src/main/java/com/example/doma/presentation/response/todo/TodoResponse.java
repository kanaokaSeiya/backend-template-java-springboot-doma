package com.example.doma.presentation.response.todo;

import lombok.Data;

import java.util.Date;

@Data
public class TodoResponse {
  private int id;
  private String name;
  private Date createTimestamp;
  private Date updateTimestamp;

  public TodoResponse(int _id, String _name, Date _createTimestamp, Date _updateTimestamp) {
    id = _id;
    name = _name;
    createTimestamp = _createTimestamp;
    updateTimestamp = _updateTimestamp;
  }
}
