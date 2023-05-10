package me.dio.challenge;

public abstract class Content {

	protected String title;
	protected String description;
	protected final int DEFAULT_XP = 10;

	public abstract int calculateXP();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}