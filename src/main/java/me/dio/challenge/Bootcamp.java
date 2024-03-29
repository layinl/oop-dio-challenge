package me.dio.challenge;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * This class represents all the contents and enrolled devs in their respective bootcamps
 */
public class Bootcamp {

	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate finishDate;
	private Set<Content> contents = new LinkedHashSet<>();
	private Set<Dev> devs = new HashSet<>();

	public Bootcamp() {
	}

	public Bootcamp(String name, String description, LocalDate startDate, Set<Content> contents,
	                Set<Dev> devs) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = startDate.plusDays(45);
		this.contents.addAll(contents);
		this.devs.addAll(devs);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	public Set<Dev> getDevs() {
		return devs;
	}

	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Bootcamp bootcamp = (Bootcamp) o;
		return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finishDate, bootcamp.finishDate) && Objects.equals(contents, bootcamp.contents) && Objects.equals(devs, bootcamp.devs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, description, startDate, finishDate, contents, devs);
	}

}
