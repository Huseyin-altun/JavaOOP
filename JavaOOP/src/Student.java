
public class Student extends User {

private int studentNumber;
private String[] lessons;


public Student() {
	
	System.out.println("Ogrenc�ler Hosgeld�n�z");
}

public int getStudentNumber() {
	return studentNumber;
}
public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
}
public String[] getLessons() {
	return lessons;
}
public void setLessons(String[] lessons) {
	this.lessons = lessons;
}

}
