package com.book4.dao;

import com.book4.datastore.Book4DataStore;
import com.book4.entities.Book4;

import java.util.List;

public class Book4Dao {
    Book4DataStore book4DataStore = new Book4DataStore();

    public void getBook4(){
        book4DataStore.setBook4();
    }

    public List<Book4> getBookMainList(){
        return book4DataStore.getBookMainList();
    }
}
