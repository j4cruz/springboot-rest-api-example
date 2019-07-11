package io.java.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.java.springboot.model.Image;
import io.java.springboot.model.Project;
import io.java.springboot.model.Technology;

@Service
public class ProjectService {
	private List<Project> projects;

	public ProjectService() {
		String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
				+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
				+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla "
				+ "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in "
				+ "culpa qui officia deserunt mollit anim id.";

		List<Technology> technologies = new ArrayList<Technology>();
		technologies.add(new Technology("React"));
		technologies.add(new Technology("Java"));
		technologies.add(new Technology("SQL"));

		List<Image> images = new ArrayList<Image>();
		images.add(new Image("Screenshot 1", "https://via.placeholder.com/150"));
		images.add(new Image("Screenshot 2", "https://via.placeholder.com/150"));

		projects = new ArrayList<>(Arrays.asList(
				new Project("perfect-timing", "Perfect Timing", "EP Collab with Metroboomin - 2019",
						"React application built with passion.", description, "/projects/perfect-timing", technologies,
						images),
				new Project("call-me", "Call Me", "EP Collab with Metroboomin - 2019",
						"React application built with passion.", description, "/projects/call-me", technologies,
						images),
				new Project("bad-habits", "Bad Habits", "EP Collab with Metroboomin - 2019",
						"React application built with passion.", description, "/projects/bad-habits", technologies,
						images)));

	}

	public List<Project> getAllProjects() {
		return projects;
	}

	public Project getProject(String id) {
		return projects.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}

	public void addProject(Project project) {
		projects.add(project);
	}

	public void updateProject(String id, Project project) {
		for (int i = 0; i < projects.size(); i++) {
			Project p = projects.get(i);
			if (p.getId().equals(id)) {
				projects.set(i, project);
				return;
			}
		}
	}

	public void deleteProject(String id) {
		projects.removeIf(p -> p.getId().equals(id));
	}
}
