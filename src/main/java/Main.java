import me.dio.challenge.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Dev darkLayin = new Dev("DarkLayin");
		Dev layin = new Dev("Layin");

		Content javaCourse = new Course("Java", "Java course", 15);
		Content javaMentoring = new Mentoring("Java Design Patterns", "Design patterns for Java application development",
			LocalDate.now());
		Content kotlinCourse = new Course("Kotlin", "Kotlin course", 12);
		Content kotlinMentoring = new Mentoring("Kotlin for mobile", "Good practices for mobile development using kotlin", LocalDate.now());

		Bootcamp javaBootcamp = new Bootcamp("Java Backend Developer", "Bootcamp for Java development", LocalDate.now(), Set.of(javaCourse, javaMentoring), Set.of(darkLayin, layin));
		Bootcamp kotlinBootcamp = new Bootcamp("Kotlin Mobile Development", "Bootcamp for kotlin mobile development", LocalDate.now(), Set.of(kotlinCourse, kotlinMentoring), Set.of(layin));

		darkLayin.subscribeToBootcamp(javaBootcamp);
		darkLayin.advance();
		System.out.println(darkLayin.calculateTotalXP());

		layin.subscribeToBootcamp(javaBootcamp);
		layin.subscribeToBootcamp(kotlinBootcamp);
		layin.advance();
		layin.advance();
		layin.advance();
		layin.advance();
		layin.advance();
		System.out.println(layin.calculateTotalXP());

	}

}
