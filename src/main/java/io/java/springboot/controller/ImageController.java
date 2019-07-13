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
import io.java.springboot.service.ImageService;
import io.java.springboot.service.ProjectService;

@RestController
public class ImageController {
	
	@Autowired
	private ImageService imageService;
	
	@Autowired
	private ProjectService projectService;

	@RequestMapping("/projects/{projectId}/images")
	public Set<Image> getAllImages(@PathVariable String projectId) {
		return imageService.getAllImages(projectId);
	}
	
	@RequestMapping("/projects/{projectId}/images/{id}")
	public Image getImage(@PathVariable Integer id) {
		return imageService.getImage(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/projects/{projectId}/images/{id}")
	public void updateImage(@RequestBody Image image, @PathVariable String projectId, @PathVariable Integer id) {
		Project project = projectService.getProject(projectId);
		Image imageToSave = new Image(id, image.getCaption(), image.getUrl(), project); 
		imageService.updateImage(imageToSave);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/projects/{projectId}/images/{id}")
	public void deleteImage(@PathVariable Integer id) {
		imageService.deleteImage(id);
	}
}