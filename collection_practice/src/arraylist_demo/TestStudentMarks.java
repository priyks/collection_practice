package arraylist_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> stud=new ArrayList<>();
		
		stud.add(new Student(101,"jaya",78));
		stud.add(new Student(104,"omkar",48));
		stud.add(new Student(107,"rutu",59));
		stud.add(new Student(108,"ashish",38));	
		stud.add(new Student(105,"komal",56));
		stud.add(new Student(106,"jaya",98));
		
		Collections.sort(stud, (s1,s2)-> { 
			return s1.marksofmath>s2.marksofmath?-1:s1.marksofmath<s2.marksofmath?1:0;
		});
		

		System.out.println("Marks in Descending order :--");
		
		for(Student s: stud) {
			System.out.println(s);
		}
		
		Collections.sort(stud,(s1,s2) ->{
			
			return s1.rollno>s2.rollno?1:s1.rollno<s2.rollno?-1:0;
		});
		
		Iterator i= stud.iterator();  // iterator 
		
		System.out.println("rollno in ascending order :--");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
