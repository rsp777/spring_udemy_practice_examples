package SPRING_MAVEN_TEST.SpringMavenTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SPRING_MAVEN_TEST.SpringMavenTest.dao.InstructorDAO;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Course;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Instructor;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.InstructorDetail;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Review;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired 
	private InstructorDAO instructorDAO;
	
	@Override
	@Transactional
	public List<Instructor> getInstructors() {
		// TODO Auto-generated method stub
		return instructorDAO.getInstructors();
	}

	@Override
	@Transactional
	public void addInstructor(Instructor theInstructor,InstructorDetail instructorDetails,Course course,Review review) {
		instructorDAO.addInstructor(theInstructor,instructorDetails,course,review);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		instructorDAO.delete(id);		
	}

	@Override
	@Transactional
	public List<Instructor> searchInstructor(String search_id_name) {
		return instructorDAO.searchInstructor(search_id_name);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Instructor getInstructor(int id) {
		return instructorDAO.getInstructor(id);
		
	}
}
