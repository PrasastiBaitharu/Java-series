package object.Interface;

public interface College {
	void course();// by default public and abstract
}

class Student implements College{
	public void course() {
		System.out.println("BCA");
	}
}
	
class Main{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.course();
	}
}
