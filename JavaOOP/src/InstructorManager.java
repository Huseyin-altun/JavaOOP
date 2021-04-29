
public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getUsername()+" Kulan�c� adl� ve "+user.getId()+" id'li ��retim eleman� eklendi");
	}
	
	
	public void delete(User user) {
		System.out.println(user.getUsername()+" Kulan�c� adl� ve "+user.getId()+" id'li ��retim eleman� silindi");
	}
	
	
	public void show(Instructor instructor) {
		System.out.print("��retmenin Verdi�i Dersler :");
		for (String s : instructor.getGivenLessons()) {
			System.out.print(" "+s);
		}


	}
}
