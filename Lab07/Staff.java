import java.time.LocalDate;

public class Staff extends Employee{
    private String title;

    //Constructure
    public Staff(String name, String address, String email_address, String phone_number, String office, double salary,LocalDate date_hired,  String title){
        super(name, address, email_address, phone_number, office, salary, date_hired);
        this.title = title;
    }

    //Methods
    public String toString(){
        return super.toString() + "Staff{title=" + this.title + "}}";
    }
}