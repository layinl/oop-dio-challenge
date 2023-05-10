package me.dio.challenge;

import java.time.LocalDate;

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

	public int calculateXP() {
		return DEFAULT_XP + 40;
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
