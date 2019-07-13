package io.java.springboot.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.springboot.dao.TechnologyRepository;
import io.java.springboot.model.Technology;

@Service
public class TechnologyServiceImpl implements TechnologyService {
	@Autowired
	private TechnologyRepository TechnologyRepository;

	public Set<Technology> getAllTechnologies() {
		Set<Technology> technologies = new HashSet<>();
		TechnologyRepository.findAll().forEach(technologies::add);
		return technologies;
	}

	public Technology getTechnology(String id) {
		return TechnologyRepository.findOne(id);
	}

	public void addTechnology(Technology Technology) {
		TechnologyRepository.save(Technology);
	}

	public void updateTechnology(Technology Technology) {
		TechnologyRepository.save(Technology);
	}

	public void deleteTechnology(String id) {
		TechnologyRepository.delete(id);
	}
}
