package io.java.springboot.model;

import java.util.List;


public class Project {

	private String id;
	private String name;
	private String subtitle;
	private String caption;
	private String description;
	private String pageUrl;
	private List<Technology> technologies;
	private List<Image> images;

	public Project() {
	}

	public Project(String id, String name, String subtitle, String caption, String description, String pageUrl,
			List<Technology> technologies, List<Image> images) {
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

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
}
