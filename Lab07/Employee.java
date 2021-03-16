import java.time.LocalDate;

public class Employee extends Person{
    private String office;
    private double salary;
    private LocalDate dateHired;

    //Construcutre
    public Employee(String name, String address, String email_address, String phone_number, String office, double salary, LocalDate date_hired){
        super(name, address, email_address, phone_number);
        this.office = office;
        this.salary = salary;
        this.dateHired = date_hired;
    }

    public String toString(){
        return super.toString() + "Employee{office=" + this.office + ", salary=" + this.salary + ", dateHired=" + this.dateHired + "}     ";
    }
}