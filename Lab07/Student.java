public class Student extends Person{

    //Constructure
    public Student(String name, String address, String email_address, String phone_number){
        super(name, address, email_address, phone_number);
    }

    //Methods
    public String toString(){
        return super.toString() + "Student{";
    }
}