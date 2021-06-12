package SPRING_MAVEN_TEST.SpringMavenTest.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.*;
import org.hibernate.query.Query;

import SPRING_MAVEN_TEST.SpringMavenTest.entity.Course;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Instructor;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.InstructorDetail;
import SPRING_MAVEN_TEST.SpringMavenTest.entity.Review;

@Repository
public class InstructorDAOImpl implements InstructorDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Instructor> getInstructors() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Instructor> theQuery = currentSession.createQuery("from Instructor");
		List<Instructor> instructors=theQuery.getResultList();
		for (Iterator<Instructor> iterator = instructors.iterator(); iterator.hasNext();) {
			Instructor instructor = (Instructor) iterator.next();
			System.out.println(instructor.toString());
		}
		return instructors;
	}
	@SuppressWarnings("unchecked")
	@Override
	public Instructor getInstructor(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Instructor> theQuery = (Query<Instructor>) currentSession.createQuery("from Instructor where id=:theId");
		theQuery.setParameter("theId",id);
		Instructor theInstructor = theQuery.getSingleResult();
		System.out.println(theInstructor);
		return theInstructor;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void addInstructor(Instructor theInstructor, InstructorDetail instructorDetails,Course tempCourse,Review tempReview) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Instructor> query0 = currentSession.createNativeQuery("SET FOREIGN_KEY_CHECKS = 1");
		query0.executeUpdate();
		theInstructor.setInstructorDetail(instructorDetails);
		theInstructor.add(tempCourse);
		currentSession.saveOrUpdate(theInstructor);
		int id = theInstructor.getId();
		theInstructor = getInstructor(id);
		tempCourse.add(tempReview);
		System.out.println("Course without review : "+tempCourse);
		currentSession.saveOrUpdate(tempCourse); 
		System.out.println("After course : "+theInstructor);
		System.out.println("Course with review : "+tempCourse);
		System.out.println("record added to database");
	}
 
	@SuppressWarnings({ "rawtypes", "unchecked" }) 
	@Override
	public List<Instructor> searchInstructor(String search_name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = null;
		if(search_name!=null&&search_name.trim().length()>0) {
			theQuery=currentSession.createQuery("from Instructor where lower(firstName) like:theName"
					+ " or lower(lastName) like:theName",Instructor.class);
			theQuery.setParameter("theName","%"+search_name.toLowerCase()+"%");
		}
		else {
			theQuery = currentSession.createQuery("from Instructor",Instructor.class);
		}
		List<Instructor> instructors = theQuery.getResultList();
		for (Instructor instructor : instructors) {
			System.out.println(instructor.toString());
		}
		return instructors;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void delete(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Instructor> query0 = currentSession.createNativeQuery("SET FOREIGN_KEY_CHECKS = 0");
		query0.executeUpdate();
		System.out.println("the id is "+id);
		Query<Instructor> query = currentSession.createQuery("delete from Instructor where id=:instructorId");
		query.setParameter("instructorId", id);
		query.executeUpdate();
	}
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
	
	

	
}
