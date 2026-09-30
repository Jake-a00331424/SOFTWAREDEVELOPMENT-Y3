import java.util.ArrayList;

public class StudentArray {
		private ArrayList<Student> listOfStudents = new ArrayList();

		public StudentArray() {
			listOfStudents.add(new Student("Mary", 4215, "Vr and Gaming"));
			listOfStudents.add(new Student("John", 6719, "Jam Making"));
			listOfStudents.add(new Student("Tom", 4213, "Dark Magic"));

		}
		public Student returnStudent(String s) {
			for(Student sid : listOfStudents)
			{
				if(sid.getName().equals(s)) {
					return sid;
				}
				
			}
			return null;
		}
	}



