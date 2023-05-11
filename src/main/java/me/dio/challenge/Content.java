package me.dio.challenge;

/**
 * The mother of courses and mentoring
 */
public abstract class Content {

	protected String title;
	protected String description;
	protected final int DEFAULT_XP = 10;

	/**
	 * Calculates XP of this content
	 * @return the total XP of this content
	 */
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