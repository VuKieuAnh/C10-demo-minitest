package controller.demo1;

import model.Book;
import model.FictionBook;
import model.ProgrammingBook;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
//    goi phuong thuc, ko qua quan tam den doi tuong
//    method static
     static List<Book> books = new ArrayList<Book>();
     static {
         books.add(new ProgrammingBook());
         books.add(new FictionBook());
         books.add(new ProgrammingBook());
         books.add(new FictionBook());
     }
//    tinh tong tien cua 6 cuon sach
    public static int sumPrice(){
         int sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getPrice();
        }
        return sum;
    }
//    lay ra so sach Programing Book co language la Java

    public static int countByLanguage(String language){
         int count = 0;
         for (int i = 0; i < books.size(); i++) {
             if (books.get(i) instanceof ProgrammingBook) {
                 ProgrammingBook programmingBook = (ProgrammingBook) books.get(i);
                 String lag = programmingBook.getLanguage();
                 if (language.equals(lag)) {
                     count++;
                 }
             }
         }
         return count;
    }

}
