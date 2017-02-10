package com.midi.spring.starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.midi.spring.starter.model.Category;
import com.midi.spring.starter.repository.CategoryRepository;

@Service
public class StarterServiceImpl implements StarterService {

	private CategoryRepository categoryRepository;

	@Autowired
	public StarterServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	@Transactional
	public void saveCategory(Category category) throws DataAccessException {
		categoryRepository.save(category);
	}

	@Override
	public Category findCategoryById(int id) throws DataAccessException {
		return categoryRepository.findById(id);
	}

}
