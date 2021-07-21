import java.util.*;
public class TestStudent {
public static void main(String[] args) {
    Student[] n = new Student[3];
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ;i<n.length;i++)
         {
            System.out.println("Please enter the name for Student number "+(i+1));
            String a = sc.nextLine();
            System.out.println("Please enter the Course for Student number "+(i+1));
            String b =sc.nextLine();
            n[i] = new Student(a, b, i+1);
         }
         sc.close();

         for (int i = 0 ;i<n.length;i++)
         {
             n[i].showStudent();
            
         }
         n[0].setCourse("CSSE");
         n[0].showStudent();
         n[2].setName("Louise Johnson");
         System.out.println(n[2].getName());
}

}

class Student{
    private String name;
    private String course;
    private int studentID=1000;
    
    public Student() {

    }

    public Student(String name, String course, int studentID) {
        this.name = name;
        this.course = course;
        this.studentID += studentID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getStudentID() {
        return studentID;
    }
    public void showStudent(){
        System.out.println(" Name: "+getName());
        System.out.println("Course: "+getCourse());
        System.out.println("Student ID: "+getStudentID());
        System.out.println("---");
    }
}