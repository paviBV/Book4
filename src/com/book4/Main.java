package com.book4;


import com.book4.manager.Book4Manager;

public class Main {

    public static void main(String[] args) {
        Book4Manager book4Manager = new Book4Manager();
        book4Manager.getBook4();
        book4Manager.deletebook4("B001");
        book4Manager.deletebook4("B003");

    }
}
