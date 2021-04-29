
public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getUsername()+" Kulanýcý adlý ve "+user.getId()+" id'li Öðretim elemaný eklendi");
	}
	
	
	public void delete(User user) {
		System.out.println(user.getUsername()+" Kulanýcý adlý ve "+user.getId()+" id'li Öðretim elemaný silindi");
	}
	
	
	public void show(Instructor instructor) {
		System.out.print("Öðretmenin Verdiði Dersler :");
		for (String s : instructor.getGivenLessons()) {
			System.out.print(" "+s);
		}


	}
}
