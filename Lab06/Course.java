import java.util.*;

public class Course{
    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();
    private int numberOfStudents;

    //Constructor
    Course(String courseName){
        this.courseName = courseName;
    }

    //Accessors
    public String getCourseName(){
        return this.courseName;
    }
    public ArrayList<String> getStudents(){
        return this.students;
    }
    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }

    //Modifiers
    
    //Functions
    public void addStudents(String student){
        this.students.add(student);
        this.numberOfStudents++;
    }
    public void dropStudents(String student){
        if(this.students.indexOf(student) == -1){
        }
        else{
            this.students.remove(this.students.indexof(student));
            this.numberofstudents--;
        }
    }
    public void clear(){
        this.students.clear();
        this.numberOfStudents = 0;
    }
}