package kodlamaIOHomeWorkWeek3.dataAccess;

import kodlamaIOHomeWorkWeek3.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veri tabanýna eklendi");
		
	}

}
