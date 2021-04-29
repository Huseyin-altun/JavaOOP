
public class Main {

	public static void main(String[] args) {
		User user=new User(5,"Hsyn","123456");
		Student student=new Student();
		Instructor intstructor=new Instructor();// Bilerek constructor eklenmedi bunun sonucunda useri taklit etti
		InstructorManager intstructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		student.setId(12);
		student.setUsername("Altn");
		intstructorManager.add(user);
		studentManager.add(student);
		String les[]= {"C#","Java"};
		student.setLessons(les);
		intstructor.setGivenLessons(les);
		studentManager.show(student);
		intstructorManager.show(intstructor);
	}

}
