package kodlamaIOHomeWorkWeek3.dataAccess;

import kodlamaIOHomeWorkWeek3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanýna eklendi");
		
	}

}
