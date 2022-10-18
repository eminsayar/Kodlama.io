package kodlamaIOHomeWorkWeek3.dataAccess;

import kodlamaIOHomeWorkWeek3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veri tabanýna eklendi");
		
	}

}
