package SPRING_MAVEN_TEST.SpringMavenTest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import SPRING_MAVEN_TEST.SpringMavenTest.entity.Course;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Instructor;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.InstructorDetail;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Review;
import SPRING_MAVEN_TEST.SpringMavenTest.service.InstructorService;

@Controller
@RequestMapping("/instructors")
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	
	@PostMapping("/add")
	public String addInstructor(@ModelAttribute("addInstructor") Instructor theInstructor,
								@RequestParam("youtubeChannel") String youtubeChannel,
								@RequestParam("hobby") String hobby, 
								@RequestParam("newCourse") String theCourse,
								@RequestParam("reviews") String review) {
		
		InstructorDetail instructorDetails = new InstructorDetail(youtubeChannel,hobby);
		Course newCourse = new Course(theCourse);
		Review newReview = new Review(review);
		instructorService.addInstructor(theInstructor,instructorDetails,newCourse,newReview);
		return "success";
	}
	
	@PostMapping("/add_course")
	public String addCourse(@ModelAttribute("addCourse") Course theCourse) {
		return "add-course";
	}
	
	@GetMapping("/showFormForAddCourse")
	public String showFormForAddCourse(Model theModel) {
		Instructor ins = new Instructor();
		Course course = new Course();
		theModel.addAttribute("addCourse",course);
		theModel.addAttribute("addInstructor",ins);
		return "add-course";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Instructor ins = new Instructor();
		theModel.addAttribute("addInstructor",ins);
		return "add-instructor";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("instructorId") int id, Model theModel) {
		Instructor theInstructor = instructorService.getInstructor(id);
		theModel.addAttribute("addInstructor",theInstructor);
		return "add-instructor";
	}
	
	@GetMapping("/list") 
	public String getInstructors(Model theModel) {
		//get the instructor from the service
		//Delegate calls to Service
		List<Instructor> instructors = instructorService.getInstructors();
		System.out.println("getInstructors method called");
		theModel.addAttribute("addInstructors",instructors);
		return "list-instructors";
	}
	
	@GetMapping("/search")
	public String searchInstructor(@ModelAttribute("search_id_name") String search_name,Model theModel) {
		List<Instructor> instructors = instructorService.searchInstructor(search_name);
		theModel.addAttribute("addInstructors",instructors);
		System.out.println(search_name);
		return "list-instructors";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("instructorId") int id) {
		instructorService.delete(id);
		return "redirect:/instructors/list";
	}
	
	
}
