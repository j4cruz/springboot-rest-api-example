package io.java.springboot.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import io.java.springboot.model.Image;

public interface ImageRepository extends CrudRepository<Image, Integer> {
	public Set<Image> findByProjectId(String projectId);
}