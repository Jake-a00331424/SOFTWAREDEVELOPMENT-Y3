
public class Tester {
	
	public static void main(String[] args) {
		StudentArray Sarr = new StudentArray();
		
		Student s = Sarr.returnStudent("Mary");
		System.out.println(s.getSid());
		Student s2 = Sarr.returnStudent("John");
		System.out.println(s2.getSid());
		Student s3 = Sarr.returnStudent("Tom");
		System.out.println(s3.getSid());
		
	}
	
}
