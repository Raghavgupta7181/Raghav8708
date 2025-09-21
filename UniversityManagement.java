class Student {
 	private static String universityName = "Princeston University"; 
 	private final int rollNumber; 
 	private String name;
 	private String grade;

 	public Student(int rollNumber, String name, String grade) {
     	this.rollNumber = rollNumber;
     	this.name = name;
     	this.grade = grade;
 	}

 	public void displayStudentDetails() {
     	if (this instanceof Student) { 
			System.out.println("Student details :\n");
         	System.out.println("University : " + universityName);
         	System.out.println("Roll Number : " + rollNumber);
         	System.out.println("Name : " + name);
         	System.out.println("Grade : " + grade);
     	}
 	}
 }

 
 public class UniversityManagement {
 	public static void main(String[] args) {
     	Student stu1 = new Student(21, "JoshAllen", "A");
     	Student stu2 = new Student(22, "PatrickMahomes", "B");
		Student stu3 = new Student(23, "TravisKelce", "B");

     	stu1.displayStudentDetails();
     	stu2.displayStudentDetails();
		stu3.displayStudentDetails();
 	}
 }
