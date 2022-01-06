package com.eomcs.mylist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Book;
import com.eomcs.util.ArrayList;

@RestController 
public class BookReviewController {

  ArrayList bookList = new ArrayList();

  public BookReviewController() {
    System.out.println("나는야 기본 생성자");
  }

  @RequestMapping("/book/list")
  public Object list() {
    return bookList.toArray(); 
  }

  @RequestMapping("/book/add")
  public Object add(Book book) {
    bookList.add(book);
    return bookList.size();
  }


  @RequestMapping("/book/get")
  public Object get(int index) {
    if (index < 0 || index >= bookList.size()) {
      return "실패";
    }
    return "성공";
  }

  @RequestMapping("/book/update")
  public Object update(int index, Book book) {
    if (index < 0 || index >= bookList.size()) {
      return "유효한 요청이 아닙니다.";
    }
    return bookList.set(index, book) == null ? "실패" : "성공";
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) {
    if (index < 0 || index >= bookList.size()) {
      return "유효한 요청이 아닙니다.";
    }
    return bookList.remove(index) == null ? "삭제 실패" : "삭제 성공";
  }
}



