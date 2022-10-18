package kodlamaIOHomeWorkWeek3.dataAccess;

import kodlamaIOHomeWorkWeek3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veri tabanýna eklendi");
		
	}

}
