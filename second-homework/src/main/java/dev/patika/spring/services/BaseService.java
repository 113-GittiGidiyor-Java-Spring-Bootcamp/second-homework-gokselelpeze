package dev.patika.spring.services;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();

    T findById(int id);

    T save(T object);

    void deleteById(int id);

    T update(T object);

}
