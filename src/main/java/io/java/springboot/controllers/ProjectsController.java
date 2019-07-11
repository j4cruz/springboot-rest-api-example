package io.java.springboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.springboot.models.Project;

@RestController
public class ProjectsController {

	@RequestMapping("/projects")
	public List<Project> getAllProjects() {

		String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
				+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
				+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla "
				+ "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in "
				+ "culpa qui officia deserunt mollit anim id est laborum.";

		return Arrays.asList(
				new Project("Perfect Timing", "EP Collab with Metroboomin - 2019",
						"React application built with passion.", description, "/projects/perfect-timing",
						"ReactJS, Java, SQL", "https://via.placeholder.com/150"),
				new Project("Call Me", "EP Collab with Metroboomin - 2019", "React application built with passion.",
						description, "/projects/call-me", "ReactJS, Java, SQL", "https://via.placeholder.com/150"),
				new Project("Bad Habits", "EP Collab with Metroboomin - 2019", "React application built with passion.",
						description, "/projects/bad-habits", "ReactJS, Java, SQL", "https://via.placeholder.com/150"));
	}
}