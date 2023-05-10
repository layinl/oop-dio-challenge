package me.dio.challenge;

/*
	Dev
	- name
	- subscribedContent
	- finishedContent
	+ subscribeBootcamp(): void
	+ advance(): void
	+ calculateTotalXP(): int
*/


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

	private String name;
	private Set<Content> subscribedContent;
	private Set<Content> finishedContent;

	public Dev() {
		subscribedContent = new LinkedHashSet<>();
		finishedContent = new LinkedHashSet<>();
	}

	public Dev(String name, Set<Content> subscribedContent, Set<Content> finishedContent) {
		this.name = name;
		this.subscribedContent = subscribedContent;
		this.finishedContent = finishedContent;
	}

	public void subscribeToBootcamp(Bootcamp bootcamp) {

	}

	public void advance() {
		subscribedContent.stream().findFirst().ifPresentOrElse(
			content -> {
			finishedContent.add(content);
			subscribedContent.remove(content);
		},
			() -> System.out.println("You are not enrolled in any content")
		);
	}

	public int calculateTotalXP() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContent() {
		return subscribedContent;
	}

	public void setSubscribedContent(Set<Content> subscribedContent) {
		this.subscribedContent = subscribedContent;
	}

	public Set<Content> getFinishedContent() {
		return finishedContent;
	}

	public void setFinishedContent(Set<Content> finishedContent) {
		this.finishedContent = finishedContent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Dev dev = (Dev) o;
		return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(finishedContent, dev.finishedContent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, subscribedContent, finishedContent);
	}

}
