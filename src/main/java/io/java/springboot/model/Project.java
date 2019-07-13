package io.java.springboot.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Project {

	@Id
	private String id;
	private String name;
	private String subtitle;
	private String caption;
	@Size(min = 1, max = 1000)
	private String description;
	private String pageUrl;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="Project_Technologies",
			joinColumns = {@JoinColumn(name = "project_id", referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name = "technology_id", referencedColumnName = "name")}
	)
	@JsonIgnoreProperties("projects")
	private Set<Technology> technologies;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="project_id",nullable=false)
	@JsonIgnoreProperties("project")
	private Set<Image> images;

	public Project() {
	}

	public Project(String id, String name, String subtitle, String caption, String description, String pageUrl,
			Set<Technology> technologies, Set<Image> images) {
		super();
		this.id = id;
		this.name = name;
		this.subtitle = subtitle;
		this.caption = caption;
		this.description = description;
		this.pageUrl = pageUrl;
		this.technologies = technologies;
		this.images = images;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public Set<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Set<Technology> technologies) {
		this.technologies = technologies;
	}

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}
}
