package com.book4.datastore;

import com.book4.entities.Book4;

import java.util.ArrayList;
import java.util.List;

public class Book4DataStore {
    List<Book4> bookMainList = new ArrayList<>();

    public void setBook4(String id, String name, int cost) {
        Book4 bookMain = new Book4();
        bookMain.setbId(id);
        bookMain.setbName(name);
        bookMain.setbCost(cost);
        bookMainList.add(bookMain);
    }

    public void setBook4(){
        setBook4("B001","Miracle",400);
        setBook4("B002","Downning",600);
        setBook4("B003","Raising Horizon",900);
    }

    public List<Book4> getBookMainList(){
        return bookMainList;
    }
}
