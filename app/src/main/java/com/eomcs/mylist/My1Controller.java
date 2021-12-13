package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My1Controller {

  String[] contacts = new String[5];
  int size = 0;

  @RequestMapping("/contact/list1")
  public Object list1() {
    String [] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = contacts[i];
    }
    return arr;
  }
  @RequestMapping("/contact/add1")
  public Object add1(String name, String email, String tel, String company) {
    String contact = "\""+ name + "," + email + "," + tel + "," + company + "\"";
    contacts[size++] = contact;
    return size;
  }
}
