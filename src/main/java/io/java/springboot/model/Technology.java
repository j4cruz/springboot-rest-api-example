package io.java.springboot.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Technology {
	
	@Id
	private String name;
	@ManyToMany(mappedBy="technologies", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH })
	@JsonBackReference
	private Set<Project> projects;

	public Technology() {

	}

	public Technology(String name, Set<Project> projects) {
		this.name = name;
		this.setProjects(projects);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
}
