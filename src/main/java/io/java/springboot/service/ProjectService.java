package io.java.springboot.service;

import java.util.Set;

import io.java.springboot.model.Project;

public interface ProjectService {
	Set<Project> getAllProjects();
	Project getProject(String id);
	void addProject(Project project);
	void updateProject(Project project);
	void deleteProject(String id);
}
