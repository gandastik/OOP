import java.time.LocalDate;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    //Constructure
    public Faculty(String name, String address, String email_address, String phone_number, String office, double salary, LocalDate date_hired, String office_hours, String rank){
        super(name, address, email_address, phone_number, office, salary, date_hired);
        this.officeHours = office_hours;
        this.rank = rank;
    }

    //Methods
    public String toString(){
        return super.toString() + "Faculty{" + "officeHours=" + this.officeHours + ", rank=" + this.rank + "}}";
    }
}