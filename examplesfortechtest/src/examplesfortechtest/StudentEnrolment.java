package examplesfortechtest;

public class StudentEnrolment {

	public static void main(String[] args) 
	{
		Student studentOne = new Student("Matthew", 22);
		Student studentTwo = new Student("Gerald", 29);
		Student studentThree = new Student("William", 27);
		System.out.println(Student.numberOfStudents);
		System.out.println(Student.getNumberOfStudents());
		
		
	}
}
