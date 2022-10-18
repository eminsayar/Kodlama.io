package kodlamaIOHomeWorkWeek3;

import kodlamaIOHomeWorkWeek3.business.CategoryManager;
import kodlamaIOHomeWorkWeek3.business.CourseManager;
import kodlamaIOHomeWorkWeek3.business.InstructorManager;
import kodlamaIOHomeWorkWeek3.dataAccess.HibernateCategoryDao;
import kodlamaIOHomeWorkWeek3.dataAccess.HibernateInstructorDao;
import kodlamaIOHomeWorkWeek3.dataAccess.JdbcCourseDao;
import kodlamaIOHomeWorkWeek3.entities.Category;
import kodlamaIOHomeWorkWeek3.entities.Course;
import kodlamaIOHomeWorkWeek3.entities.Instructor;
import kodlamaIOHomeWorkWeek3.logging.DatabaseLogger;
import kodlamaIOHomeWorkWeek3.logging.FileLogger;
import kodlamaIOHomeWorkWeek3.logging.Logger;
import kodlamaIOHomeWorkWeek3.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category(0, "Programlama");
		Category category2 = new Category(1, "�ngilizce");
		Category category3 = new Category(2, "Kariyer Y�netimi");
		
		Instructor instructor1 = new Instructor("58765458691", "Engin Demiro�");
		Instructor instructor2 = new Instructor("58765458691", "Emin Sayar");
		
		Course course1 = new Course(0, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", 49.90, category1, instructor1);
		Course course2 = new Course(1, "Senior Yaz�l�m Geli�tirici Yeti�tirme Kamp�", 99.90, category1, instructor1);
		Course course3 = new Course(2, "(2022) Yaz�l�m Geli�tirici Yeti�tirme Kamp� - JAVA", 49.90, category1, instructor1);
		Course course4 = new Course(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JavaScript)", 49.90, category1, instructor1);
		Course course5 = new Course(4, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", 49.90, category1, instructor1);
		Course course6 = new Course(5, "Programlamaya Giri� ��in Temel Kurs", 19.90, category1, instructor2);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		Course[] courses = {course1, course2, course3, course4, course5, course6};
		Category[] categories = {category1, category2, category3};
		Instructor[] instructors = {instructor1, instructor2};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers, instructors);
		for(Category category : categories) {
			categoryManager.addCategory(category);
		}
		for(Instructor instructor : instructors) {
			instructorManager.addInstructor(instructor);
		}
		for(Course course : courses) {			
			courseManager.addCourse(course);
		}
		
		for(Course course : courses) {			
			System.out.println("Kurs Ad� : " + course.getCourseName());
			System.out.println("Kurs Id : " + course.getId());
			System.out.println("Kurs �creti : " + course.getCoursePrice());
			System.out.println("Kurs Kategorisi : " + course.getCategoryName());
			System.out.println("Kurs E�itmeni : " + course.getInstructorName());
			System.out.println();
		}
	}

}
