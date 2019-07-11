package io.java.springboot.models;

public class Project {

	private String name;
	private String subtitle;
	private String caption;
	private String description;
	private String pageUrl;
	private String technologies;
	private String imageUrl;

	public Project(String name, String subtitle, String caption, String description, String pageUrl,
			String technologies, String imageUrl) {
		super();
		this.name = name;
		this.subtitle = subtitle;
		this.caption = caption;
		this.description = description;
		this.pageUrl = pageUrl;
		this.technologies = technologies;
		this.imageUrl = imageUrl;
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

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
