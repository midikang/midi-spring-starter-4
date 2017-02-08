package com.midi.spring.starter.repository.jdbc;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.midi.spring.starter.model.Category;
import com.midi.spring.starter.repository.CategoryRepository;

@Repository
public class JdbcCategoryRepository implements CategoryRepository {

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public Category findById(int id) throws DataAccessException {
		Category category;
		String sql = "SELECT id, name, created_at, updated_at FROM categories WHERE id=:id";
		Map<String, Object> paramMap = new HashMap();
		paramMap.put("id", id);
		category = this.jdbcTemplate.queryForObject(sql, paramMap, BeanPropertyRowMapper.newInstance(Category.class));
		return category;
	}

	private SimpleJdbcInsert jdbcInsert;

	@Autowired
	public JdbcCategoryRepository(DataSource dataSource) {
		this.jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("categories").usingGeneratedKeyColumns("id");
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public void save(Category category) throws DataAccessException {
		BeanPropertySqlParameterSource paramap = new BeanPropertySqlParameterSource(category);

		if (category.isNew()) {
			Number newKey = this.jdbcInsert.executeAndReturnKey(paramap);
			category.setId(newKey.intValue());
		} else {
			String sql = "UPDATE categories set name=:name, created_at=:created_at, created_at=:created_at WHERE id=:id ";
			jdbcTemplate.update(sql, paramap);
		}
	}

}
