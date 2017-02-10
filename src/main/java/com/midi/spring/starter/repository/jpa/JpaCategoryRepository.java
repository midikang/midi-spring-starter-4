package com.midi.spring.starter.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.midi.spring.starter.model.Category;
import com.midi.spring.starter.repository.CategoryRepository;

@Repository
public class JpaCategoryRepository implements CategoryRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Category category) throws DataAccessException {
		if (category.getId() == null) {
			this.em.persist(category);
		} else {
			this.em.merge(category);
		}
	}

	@Override
	public Category findById(int id) throws DataAccessException {
		Query query = this.em.createQuery("SELECT category FROM Category category WHERE category.id=:id");
		query.setParameter("id", id);
		return (Category)query.getSingleResult();
	}

}
