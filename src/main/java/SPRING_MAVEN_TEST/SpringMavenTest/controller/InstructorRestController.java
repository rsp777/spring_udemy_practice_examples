package SPRING_MAVEN_TEST.SpringMavenTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InstructorRestController {
	
	@GetMapping("/helo")
	public String getCustomers() {
		return "System......";
	}
}
