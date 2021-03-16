public class Status extends Student{
    private final String status;
    
    //Constructure
    public Status(String name, String address, String email_address, String phone_number, final String status){
        super(name, address, email_address, phone_number);
        this.status = status;
    } 

    //Methods
    public String toString(){
        return super.toString() + "status=" + this.status + "}"; 
    }
}