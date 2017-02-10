package com.midi.spring.starter.service;

import org.springframework.dao.DataAccessException;

import com.midi.spring.starter.model.Category;

public interface StarterService {
	/**
	 * Save an <code>Category</code> to the data store, either inserting or updating it.
	 * @param category
	 * @throws DataAccessException
	 */
	void saveCategory(Category category) throws DataAccessException;
	
	Category findCategoryById(int id) throws DataAccessException;

}
