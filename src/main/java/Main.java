import me.dio.challenge.Content;
import me.dio.challenge.Course;
import me.dio.challenge.Mentoring;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Content course = new Course("Java", "Java course", 10);
		Content mentoring = new Mentoring("Java Design Patterns", "Design patterns for Java application development",
			LocalDate.now());

		System.out.println(course);
		System.out.println(mentoring);
	}

}
