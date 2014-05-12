package ru.business;

import java.util.List;

public interface BaseBussiness<T> {
	List<T> findAll();
	T findOne(Long id);
	
	T update(T t);
	T insert(T t);
	void delete(T t);		
	
	void sendChangeEmail(T t);	
	void sendCreationEmail(T t);
}
