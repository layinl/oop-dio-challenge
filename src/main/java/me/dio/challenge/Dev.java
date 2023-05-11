package me.dio.challenge;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents any registered Dev that is or isn't enrolled
 */
public class Dev {

	private String name;
	private Set<Content> subscribedContent = new LinkedHashSet<>();
	private Set<Content> finishedContent = new LinkedHashSet<>();

	public Dev() {
	}

	public Dev(String name) {
		this.name = name;
	}

	/**
	 * Subscribes this Dev to the Bootcamp and adds all its content
	 * @param bootcamp the bootcamp to be enrolled
	 */
	public void subscribeToBootcamp(Bootcamp bootcamp) {
		subscribedContent.addAll(bootcamp.getContents());
		bootcamp.getDevs().add(this);
	}

	/**
	 * Finishes the first subscribed content and advances to the next. If there is no other content, it prints an error
	 */
	public void advance() {
		subscribedContent.stream().findFirst().ifPresentOrElse(
			content -> {
			finishedContent.add(content);
			subscribedContent.remove(content);
		},
			() -> System.err.println("You are not enrolled in any content")
		);
	}

	/**
	 * Calculates total XP based on the finished content
	 * @return Total XP earned
	 */
	public int calculateTotalXP() {
		return finishedContent.stream().mapToInt(Content::calculateXP).sum();
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
