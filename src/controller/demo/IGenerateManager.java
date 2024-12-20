package controller.demo;

import java.util.List;

public interface IGenerateManager<T> {
    List<T> getAll();
    void add(T t);
    void remove(T t);
    T findById(int id);
}
