package com.book4.manager;

import com.book4.dao.Book4Dao;

public class Book4Manager {
    Book4Dao book4Dao = new Book4Dao();

    public void getBook4(){
        book4Dao.getBook4();
        for (int i = 0; i < book4Dao.getBookMainList().size(); i++) {
        System.out.println(book4Dao.getBookMainList().get(i));
        }
    }

    public void deletebook4(String id){
        System.out.println("Deleting record ");
        for (int i = 0; i < book4Dao.getBookMainList().size(); i++) {
            if (book4Dao.getBookMainList().get(i).getbId()==id) {
                book4Dao.getBookMainList().remove(i);
            }
        }
        for (int i = 0; i < book4Dao.getBookMainList().size(); i++) {
            if (book4Dao.getBookMainList().get(i).getbId()==id) {
                System.out.println(" Found");
                break;
            }else{
                System.out.println("Deleted");
                break;
            }
        }
        for (int i = 0; i < book4Dao.getBookMainList().size(); i++) {
            System.out.println(book4Dao.getBookMainList().get(i));
        }
    }
}
