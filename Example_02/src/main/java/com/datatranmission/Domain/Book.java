package com.datatranmission.Domain;

import com.datatranmission.springController.UserCtroller;

import javax.naming.Name;
import java.util.Map;
import java.util.Set;

public class Book {
    private String bookName;
    private User user;
    private String type;
    private Map<String, User> usermap;

    @Override
    public String toString() {

        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", user=" + user +
                ", type='" + type + '\'' +
                ", usermap=" + usermap+
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, User> getUsermap() {
        return usermap;
    }

    public void setUsermap(Map<String, User> usermap) {
        this.usermap = usermap;
    }
}

