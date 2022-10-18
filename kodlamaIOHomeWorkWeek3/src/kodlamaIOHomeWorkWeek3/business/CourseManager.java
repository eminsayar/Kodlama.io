package kodlamaIOHomeWorkWeek3.business;

import kodlamaIOHomeWorkWeek3.dataAccess.CourseDao;
import kodlamaIOHomeWorkWeek3.entities.Category;
import kodlamaIOHomeWorkWeek3.entities.Course;
import kodlamaIOHomeWorkWeek3.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void addCourse(Course course) throws Exception {
		if(course.getCoursePrice() <= 0.0) {
			throw new Exception("Ürün fiyatý 10'dan küçük olamaz!");
		}
		
		for(Course currentCourse: courses) {
			if(currentCourse != course) {
				if(currentCourse.getCourseName() == course.getCourseName()) {
					throw new Exception("Kurs adý baþka bir kursla ayný olamaz!");
				}
			}
		}
		
		for(Course currentCourse: courses) {
			if(currentCourse != course) {
				if(currentCourse.getId() == course.getId()) {
					throw new Exception("Kurs Id'si baþka bir kursla ayný olamaz!");
				}
			}
		}
				
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		System.out.println();
	}
}
