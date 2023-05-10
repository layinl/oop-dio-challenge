package me.dio.challenge;

public class Course extends Content {
	private int workload;

	public Course() {
	}

	public Course(String title, String description, int workload) {
		this.title = title;
		this.description = description;
		this.workload = workload;
	}

	public int calculateXP() {
		return DEFAULT_XP + 30;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course{ " + "title : '" + title + '\'' + ", description : '" + description + '\'' + ", workload : " + workload + '}';
	}

}
