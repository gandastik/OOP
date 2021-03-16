public class Person {
    protected String name;
    protected String address;
    protected String emailAddress;
    protected String phoneNumber;

    //Constructure
    public Person(String name, String address, String email_address, String phone_number){
        this.name = name;
        this.address = address;
        this.emailAddress = email_address;
        this.phoneNumber = phone_number;
    }

    //Methods
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }    
    public String getEmail(){
        return this.emailAddress;
    }
    public String toString(){
        return "Person{name=" + this.name + ", address=" + this.address + 
        ", phoneNumber=" + this.phoneNumber + ", email=" + this.emailAddress + "}     ";
    }
    
}