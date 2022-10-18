package kodlamaIOHomeWorkWeek3.business;

import kodlamaIOHomeWorkWeek3.dataAccess.InstructorDao;
import kodlamaIOHomeWorkWeek3.entities.Instructor;
import kodlamaIOHomeWorkWeek3.logging.Logger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	private Instructor[] instructors;
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers, Instructor[] instructors) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructors;
	}

	public void addInstructor(Instructor instructor) throws Exception {
		for(Instructor currentInstructor : instructors) {
			if(currentInstructor != instructor) {
				if((currentInstructor.getTcNo()).equals(instructor.getTcNo()) ) {
					throw new Exception("Eðitmen TC'si ayný olamaz!");
				}
			}
		}
		
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
		System.out.println();
	}
	
}
