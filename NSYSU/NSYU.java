interface Moveable {
    void move();
}
abstract class Animal implements Moveable {
    private String Name;
    public abstract void eat();
    public void move() {System.out.print("animal moves");}
    public void sleep(){}
}
class Mammal extends Animal {
    public void eat() {
        System.out.println("gimme meat");
    }
    public void regulateTemperature(){

    }
}
class Human extends Mammal {
    public void think(){
    }
    public void move() {
        System.out.println("human walks");
    }
}
public class NSYU {
    public static void main(String[] argv) {
        Moveable m = new Mammal();
        //Mammal mv = (Mammal)m;
        m.eat();
        //mv.eat();

        //Animal a = new Human();
        //Moveable m = a;
        //m.move();
    }
}
