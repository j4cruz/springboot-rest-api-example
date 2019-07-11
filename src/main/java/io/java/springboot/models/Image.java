package io.java.springboot.models;

public class Image {
	private String caption;
	private String url;
	
	public Image(String caption, String url) {
		this.caption = caption;
		this.url = url;
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
}
