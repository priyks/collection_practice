package arraylist_demo;

public class Student {
	int rollno;
	private String Name;
	int marksofmath;
	
	public Student(int rollno, String name, int marksofmath) {
		super();
		this.rollno = rollno;
		Name = name;
		this.marksofmath = marksofmath;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + ", marksofmath=" + marksofmath + "]";
	}
	
	

}
