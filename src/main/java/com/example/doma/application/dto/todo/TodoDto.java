package com.example.doma.application.dto.todo;

import lombok.Data;

import java.util.Date;

@Data
public class TodoDto {
  private int id;
  private String name;
  private int version;
  private Date createTimestamp;
  private Date updateTimestamp;

  public TodoDto(int _id, String _name, int _version, Date _createTimestamp, Date _updateTimestamp) {
    id = _id;
    name = _name;
    version = _version;
    createTimestamp = _createTimestamp;
    updateTimestamp = _updateTimestamp;
  }
}
