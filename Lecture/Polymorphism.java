import javax.management.monitor.GaugeMonitorMBean;

//Monday March 15, 2021 - Polymorphism, Method Matching vs. Binding, 
public class Polymorphism {
    public static void main(String[] args) {
        m(new A()); //pass in a Superclass object
        m(new B()); //pass in a Subclass object

        B o = new B();
        //Methods Matching (Complier just checking the method)
        //Essentially just checking the initial class if it has the method that has been invoked (if not just move on to the superclass).

        
        //Method Binding
        //using methods from the superclass because the subclass doesnt have the overiding methods. (first-find implementation)
        o.printSomething("print something"); 

        /**
        Casting Objects
        you can cast Superclass to Subclass (ex. by doing as you cast double to int.)
        **/ 
        A a = new B();

        //Using instanceof
        Geometric s = new Rect(10, 20);
        Geometric c = new Circle(14);
        display(s);
        display(c);
    }

    //methods that takes in an A class as a paremeter "Polymorphism"
    public static void m (A a) {
        System.out.println(a.toString());
    }

    //Using instanceof operator to choose which methods to use from the seperate subclass.
    public static void display(Geometric o) {
        //Check if O is a subclass (class) of Circle
        if ( o instanceof Circle) {
            o.getArea();
        }
        else if( o instanceof Rect) {
            o.getArea();
        }
    }
}

class A {

    public String toString() {
        return "THIS IS FROM A CLASS";
    }

    public void printSomething(String something) {
        System.out.println("eieiza");
    }
}

class B extends A {

    public String toString() {
        return "THIS IS FROM B CLASS";
    }

    public void printSomething(String something) {
        System.out.println(something);
    }
}


class Geometric{

    //Constructure
    Geometric() {

    }

    public double getArea() {
        return 0;
    }

}

class Circle extends Geometric {
    private double r;

    //Constructures
    Circle(double r){
        this.r = r;
    }

    public double getArea(){
        System.out.println(Math.PI  * this.r * this.r );
        return Math.PI * this.r * this.r;
    }
}

class Rect extends Geometric {
    private double width;
    private double height;
    
    //Constructure
    Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        System.out.println(this.width * this.width);
        return this.width * this.height;
    }
}

