package com.midi.spring.starter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean isNew() {
		return (this.id== null);
	}
	
	@Column(name="created_at")
	@Type(type="org.joda.time.DateTime")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private DateTime createAtDate;
	
	@Column(name="updated_at")
	@Type(type="org.joda.time.DateTime")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private DateTime updateAtDate;

	public DateTime getCreateAtDate() {
		return createAtDate;
	}

	public void setCreateAtDate(DateTime createAtDate) {
		this.createAtDate = createAtDate;
	}

	public DateTime getUpdateAtDate() {
		return updateAtDate;
	}

	public void setUpdateAtDate(DateTime updateAtDate) {
		this.updateAtDate = updateAtDate;
	}
	
}
