package io.java.springboot.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.springboot.dao.ProjectRepository;
import io.java.springboot.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectRepository projectRepository;

	public Set<Project> getAllProjects() {
		Set<Project> projects = new HashSet<>();
		projectRepository.findAll().forEach(projects::add);
		return projects;
	}

	public Project getProject(String id) {
		return projectRepository.findOne(id);
	}

	public void addProject(Project project) {
		projectRepository.save(project);
	}

	public void updateProject(Project project) {
		projectRepository.save(project);
	}

	public void deleteProject(String id) {
		projectRepository.delete(id);
	}
}
