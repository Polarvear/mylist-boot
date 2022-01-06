package com.eomcs.mylist.domain;

public class Board {
  String title;
  String content;
  String password;
  int viewCount;
  java.sql.Date createdDate;
  @Override
  public String toString() {
    return "Board [title=" + title + ", content=" + content + ", password=" + password
        + ", viewCount=" + viewCount + ", createdDate=" + createdDate + "]";
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Object getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  public java.sql.Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(java.sql.Date createdDate) {
    this.createdDate = createdDate;
  }


}
