import java.util.*;

public class Lab06_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the course name : ");
        String courseName = in.nextLine();
        Course course = new Course(courseName);
        System.out.print("Please enter the number of students you want to add to the course : ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Please enter the " + i + "st student name : ");
            String studentName = in.next();
            course.addStudents(studentName);
        }
        System.out.println("The lists of all students in the course:");
        ArrayList<String> arrayOfStudent = course.getStudents();
        for(int i = 0;i<arrayOfStudent.size();i++){
            System.out.println(arrayOfStudent.get(i));
        }
        System.out.print("Enter the name of the student you want to drop : ");
        String studentName = in.next();
        course.dropStudents(studentName);
        System.out.println("The lists of all students in the course:");
        for(int i = 0;i<arrayOfStudent.size();i++){
            System.out.println(arrayOfStudent.get(i));
        }
        course.clear();
        for(int i = 0;i<arrayOfStudent.size();i++){
            System.out.println(arrayOfStudent.get(i));
        }
    }
}