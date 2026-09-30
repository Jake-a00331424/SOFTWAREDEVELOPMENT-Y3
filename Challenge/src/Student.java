public class Student {
	private String name;
	private int sid;
	private String course;
	
	public Student(String name, int sid, String course)
	{
		this.name = name;
		this.sid = sid;
		this.course =  course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
}