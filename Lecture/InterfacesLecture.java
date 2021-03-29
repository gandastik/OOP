public class InterfacesLecture {

    public static void main(String[] args) {

        Edible[] e = {new Apple(), new Chicken()};
        for (Edible o: e) {
            System.out.println(o.toString());
            o.howToEat();
        }
    }

}


interface Edible{

    public abstract void howToEat();
}

class Apple implements Edible{

    Apple() {

    }
    
    public void howToEat() {
        System.out.println("Wash them through water");
        System.out.println("Peel or not peel, It's your choice!");
        System.out.println("Enjoy your meal!");
    }

    @Override
    public String toString() {
        return "Apple";
    }
}

class Chicken implements Edible {

    Chicken() {

    }

    public void howToEat() {
        System.out.println("Cooked ? if yes go ahead feast!!, if not cook it and eat it!");
    }

    @Override
    public String toString() {
        return "Chicken";
    }
}