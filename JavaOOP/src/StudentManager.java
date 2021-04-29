public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getUsername()+" Kulan�c� adl� ve "+user.getId()+" id'li ��renci eklendi");
	}
	
	
	public void delete(User user) {
		System.out.println(user.getUsername()+" Kulan�c� adl� ve "+user.getId()+" id'li ��renci silindi");
	}
	
	
	public void show(Student students) {
		System.out.print("��rencilerin Ald�g� Dersler :");
		for (String s : students.getLessons()) {
			System.out.print(" "+s);
		}
	System.out.println();
	
	}
}
