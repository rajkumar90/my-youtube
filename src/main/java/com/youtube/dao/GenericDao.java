package com.youtube.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

/**
 * Generic DAO class with get, add, update and delete methods
 * @author raj
 *
 * @param <T>
 */
@Component
public class GenericDao<T> {
	@PersistenceContext
	protected EntityManager em;
	
	public void add(T entity) {
		em.persist(entity);
	}
	
	public T get(Class<T> entityClass, String id) {
		T entity = em.find(entityClass , id);
		return entity;
	}
	
	public T update(T entity) {
		return em.merge(entity);
	}
	
	public void delete(Class<T> entityClass, String id) {
		T entity = em.find(entityClass, id);
		em.remove(entity);
	}
		
}
