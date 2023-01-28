package user;

public class Student extends UniversityUser{
	
	public static Student getInstanceOf() {
		Student stu = new Student();
		return stu;
	}
}
