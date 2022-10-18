package kodlamaIOHomeWorkWeek3.entities;

public class Instructor {
	private String tcNo;
	private String instructorName;

	public Instructor() {
		super();
	}

	public Instructor(String tcNo, String instructorName) {
		super();
		this.tcNo = tcNo;
		this.instructorName = instructorName;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcno(String id) {
		this.tcNo = id;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorFirstName(String instructorName) {
		this.instructorName = instructorName;
	}
}
