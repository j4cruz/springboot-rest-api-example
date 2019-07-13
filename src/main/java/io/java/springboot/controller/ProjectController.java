package io.java.springboot.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.springboot.model.Image;
import io.java.springboot.model.Project;
import io.java.springboot.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;

	@RequestMapping("/projects")
	public Set<Project> getAllProjects() {
		return projectService.getAllProjects();
	}
	
	@RequestMapping("/projects/{id}")
	public Project getProject(@PathVariable String id) {
		return projectService.getProject(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/projects")
	public void addProject(@RequestBody Project project) {
		projectService.addProject(project);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/projects/{projectId}/images")
	public void addImage(@RequestBody Image image, @PathVariable String projectId) {
		Project project = projectService.getProject(projectId);
		Image imageToSave = new Image(null, image.getCaption(), image.getUrl(), project); 
		project.addImage(imageToSave);
		projectService.updateProject(project);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/projects/{id}")
	public void updateProject(@PathVariable String id, @RequestBody Project project) {
		projectService.updateProject(project);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/projects/{id}")
	public void deleteProject(@PathVariable String id) {
		projectService.deleteProject(id);
	}
}