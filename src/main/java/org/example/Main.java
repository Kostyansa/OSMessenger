package org.example;

import org.example.entity.Group;
import org.example.entity.Message;
import org.example.entity.User;

public class Main {
    public static void main(String[] args) {
        User ivan = new User("Иван", "qwerty", "");
        User vitya = new User("Витя", "qwerty", "");

        Group group = new Group("First", "First Group");

        Message message = new Message("Hello world");

        System.out.println(group);
    }
}