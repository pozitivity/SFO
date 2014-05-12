package ru.daoservice;

import java.util.List;

public interface BaseDao<T> {
    public T findOne(Long id);
    public List<T> findAll();
    T update(T t);
    T insert(T t);
	void delete(T t);		   
}
