package io.java.springboot.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.springboot.model.Image;
import io.java.springboot.repository.ImageRepository;

@Service
public class ImageService {
	@Autowired
	private ImageRepository imageRepository;

	public Set<Image> getAllImages(String projectId) {
		Set<Image> images = new HashSet<>();
		imageRepository.findByProjectId(projectId).forEach(images::add);
		return images;
	}

	public Image getImage(Integer id) {
		return imageRepository.findOne(id);
	}

	public void updateImage(Image image) {
		imageRepository.save(image);
	}

	public void deleteImage(Integer id) {
		imageRepository.delete(id);
	}
}
