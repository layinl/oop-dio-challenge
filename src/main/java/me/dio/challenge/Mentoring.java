package me.dio.challenge;

import java.time.LocalDate;

/**
 * The Mentoring class
 */
public class Mentoring extends Content {

	private String title;
	private String description;
	private LocalDate date;

	public Mentoring() {
	}

	public Mentoring(String title, String description, LocalDate date) {
		this.title = title;
		this.description = description;
		this.date = date;
	}

	/**
	 * Calculates XP of this content
	 * @return the total XP of this mentoring
	 */
	public int calculateXP() {
		return DEFAULT_XP + 30;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentoring{" + "title :  '" + title + '\'' + ", description :  '" + description + '\'' + ", date : " + date + '}';
	}
}
