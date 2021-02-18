public class BMI{
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private double bmi;

    //Constructor
    BMI(String name, int age, double weight, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    //Accessors
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getFeet(){
        return this.feet;
    }
    public double getInches(){
        return this.inches;
    }
    public double getBMI(){
        this.bmi = (this.weight*0.45359237) / Math.pow(((this.feet * 12 + this.inches) * 0.0254), 2);
        return (this.weight*0.45359237) / Math.pow(((this.feet * 12 + this.inches) * 0.0254), 2);
    }
    public String getInterpretation(){
        if(this.bmi >= 30.0){
            return "Obese";
        }
        else if(this.bmi >= 25.0){
            return "Overweight";
        }
        else if(this.bmi >= 18.5){
            return "Normal";
        }
        else if(this.bmi >= 0){
            return "Underweight";
        }
        else{
            return "Error Interpretation";
        }
    }

    //Modifiers
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setFeet(double feet){
        this.feet = feet;
    }
    public void setInches(double inches){
        this.inches = inches;
    }
}