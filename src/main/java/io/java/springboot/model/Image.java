package io.java.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String caption;
	private String url;
	
	@ManyToOne
	@JoinColumn(name="project_id", nullable=false,insertable=false,updatable=false )
	@JsonBackReference
	private Project project;

	public Image() {
		
	}
	
	public Image(Integer id, String caption, String url, Project project) {
		super();
		this.id = id;
		this.caption = caption;
		this.url = url;
		this.project = project;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", caption=" + caption + ", url=" + url + ", projectId=" + project.getId() + "]";
	}
	
	
}
