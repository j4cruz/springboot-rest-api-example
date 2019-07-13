package io.java.springboot.service;

import java.util.Set;

import io.java.springboot.model.Technology;

public interface TechnologyService {
	Set<Technology> getAllTechnologies();
	Technology getTechnology(String id);
	void addTechnology(Technology Technology);
	void updateTechnology(Technology Technology);
	void deleteTechnology(String id);
}