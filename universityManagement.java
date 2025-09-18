import java.util.Scanner;

class Student{
    Scanner input=new Scanner(System.in);
    public String rollNumber;
    protected String name;
    private double CGPA;
    Student(){
        System.out.println("\n\nEnter student details :\n");
        System.out.print("Enter student roll number : ");
        rollNumber=input.next();
        System.out.print("Enter student name : ");
        name=input.next();
        System.out.print("Enter student CGPA : ");
        CGPA=input.nextDouble();
    }
    void show(){
        System.out.println("\n\nStudent details :\n");
        System.out.print("Student roll number : "+rollNumber);
        System.out.print("\nStudent CGPA : "+CGPA);
    }
    public void updateCGPA(){
         System.out.print("\n\nEnter new CGPA score : ");
         CGPA=input.nextDouble();
         System.out.print("\nUpdated Student CGPA : "+CGPA);
    }
}

class  PostgraduateStudent extends Student{
    void showName(){
        System.out.println("\n\nStudent name from subclass : "+name);
    }
}
public class universityManagement{
    public static void main(String[] args) {
        PostgraduateStudent stud=new PostgraduateStudent();
        stud.show();
        stud.updateCGPA();
        stud.showName();
        
    }
}