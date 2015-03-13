package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template,
				name));
	}

	@RequestMapping("/person")
	public Person getPerson() {
		return new Person();
	}

	@RequestMapping("/person1")
	public Person getPerson(
			@RequestParam(value = "firstname") String firstname,
			@RequestParam String lastname,
			@RequestParam(value = "agge", defaultValue = "0") int age) {
		return new Person(firstname, lastname, age);
	}
}
