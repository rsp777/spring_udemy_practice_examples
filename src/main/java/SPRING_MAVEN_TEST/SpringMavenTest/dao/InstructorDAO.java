package SPRING_MAVEN_TEST.SpringMavenTest.dao;

import java.util.List;

import SPRING_MAVEN_TEST.SpringMavenTest.entity.Course;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Instructor;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.InstructorDetail;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Review;

public interface InstructorDAO {

	public List<Instructor> getInstructors();  

	public void addInstructor(Instructor theInstructor, InstructorDetail instructorDetails,Course course, Review review);

	public void deleteAll();

	public List<Instructor> searchInstructor(String search_id_name);

	public void delete(int id);

	public Instructor getInstructor(int id);


}
