public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getUsername()+" Kulanýcý adlý ve "+user.getId()+" id'li öðrenci eklendi");
	}
	
	
	public void delete(User user) {
		System.out.println(user.getUsername()+" Kulanýcý adlý ve "+user.getId()+" id'li öðrenci silindi");
	}
	
	
	public void show(Student students) {
		System.out.print("Öðrencilerin Aldýgý Dersler :");
		for (String s : students.getLessons()) {
			System.out.print(" "+s);
		}
	System.out.println();
	
	}
}
