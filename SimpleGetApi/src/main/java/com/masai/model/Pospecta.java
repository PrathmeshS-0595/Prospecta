package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Pospecta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classId;
	
	private String title;
	private String description;
	private String classAuth;
	private String classCategory;
	private String classCors;
	public Pospecta(Long classId, String title, String description, String classAuth, String classCategory,
			String classCors) {
		super();
		this.classId = classId;
		this.title = title;
		this.description = description;
		this.classAuth = classAuth;
		this.classCategory = classCategory;
		this.classCors = classCors;
	}
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClassAuth() {
		return classAuth;
	}
	public void setClassAuth(String classAuth) {
		this.classAuth = classAuth;
	}
	public String getClassCategory() {
		return classCategory;
	}
	public void setClassCategory(String classCategory) {
		this.classCategory = classCategory;
	}
	public String getClassCors() {
		return classCors;
	}
	public void setClassCors(String classCors) {
		this.classCors = classCors;
	}
	public Pospecta() {
		super();
	}
	
	
	

}

