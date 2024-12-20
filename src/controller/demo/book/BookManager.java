package controller.demo.book;

import model.Book;

import java.util.Collections;
import java.util.List;

public class BookManager implements IBookManager {
    @Override
    public List<Book> getAll() {
        return Collections.emptyList();
    }

    @Override
    public void add(Book book) {

    }

    @Override
    public void remove(Book book) {

    }

    @Override
    public Book findById(int id) {
        return null;
    }
}
