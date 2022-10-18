package kodlamaIOHomeWorkWeek3.entities;

public class Course {
	private int id;
	private String courseName;
	private double coursePrice;
	private Category category;
	private Instructor instructor;

	public Course() {
		super();
	}

	public Course(int id, String name, double coursePrice, Category category, Instructor instructor) {
		super();
		this.id = id;
		this.courseName = name;
		this.coursePrice = coursePrice;
		this.category = category;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	public String getCategoryName() {
		return this.category.getCategoryName();
	}
	
	public String getInstructorName() {
		return this.instructor.getInstructorName();
	}
}
