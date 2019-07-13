package io.java.springboot.service;

import java.util.Set;

import io.java.springboot.model.Image;

public interface ImageService {
	Set<Image> getAllImages(String projectId);
	Image getImage(Integer id);
	void updateImage(Image image);
	void deleteImage(Integer id);
}
