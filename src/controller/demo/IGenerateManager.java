package controller.demo;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface IGenerateManager<T> {
    Collection<T> getAll();
    void add(T t);
    void remove(T t);
    T findById(int id);
}
