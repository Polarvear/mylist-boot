package com.eomcs.mylist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Todo;
import com.eomcs.util.ArrayList;

@RestController 
public class TodoController {

  //인스턴스활용
  ArrayList todoList = new ArrayList();

  @RequestMapping("/todo/list")
  public Object list() {
    return todoList.toArray(); 
  }

  @RequestMapping("/todo/add")
  public Object add(Todo todo) {
    todoList.add(todo);
    return todoList.size;
  }

  @RequestMapping("/todo/update")
  public Object update(int index, Todo todo) {
    if (index < 0 || index >= todoList.size) {
      return 0;
    }
    Todo old = (Todo)todoList.list[index];
    todo.setDone(old.isDone()); // 기존의 체크정보는 그대로 가져가야한다. boolean 값의 경우 get말고 is 임

    return todoList.set(index, todo) == null ? 0 : 1; // 첫번째로 객체의 주소를 주면댄다
  }

  @RequestMapping("/todo/check")
  public Object check(int index, boolean done) {
    if (index < 0 || index >= todoList.size) {
      return 0;  // 인덱스가 무효해서 설정하지 못했다.
    }

    ((Todo) todoList.list[index]).isDone = done;
    return 1; // 해당 항목의 상태를 변경했다.
  }

  @RequestMapping("/todo/delete")
  public Object delete(int index) {
    if (index < 0 || index >= todoList.size) {
      return 0;
    }

    todoList.remove(index);
    return 1;
  }
}



