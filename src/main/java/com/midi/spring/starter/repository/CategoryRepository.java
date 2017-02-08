package com.midi.spring.starter.repository;

import org.springframework.dao.DataAccessException;

import com.midi.spring.starter.model.Category;

public interface CategoryRepository {

	void save(Category category) throws DataAccessException;
}
