public class Abstract{
    public static void main(String[] args){
       Car obj = new Car("rode");
       obj.displayName();
       obj.dancing();

        System.out.println(Car.fname);
    }
}
interface Person1{
    
    void dancing();
}

interface Person{
    String fname = "rodee";
   
   void displayName();
}

abstract class Vehicle{
    abstract void go();
    abstract void moving();
}

class Car extends Vehicle implements Person, Person1{
    String name;

    Car(String name){
        this.name = name;
    }

    void go(){
        System.out.println("the " + this.name + " is moving");
    }

    void moving(){
        System.out.println(this.name + " is moving");
    }
    public void displayName(){
        System.out.println(this.name + " interface");
    }

    public void dancing(){
        System.out.println("this person is dancing");
    }
}

class Jeep extends Vehicle{
    String name;

    Jeep(String name){
        this.name = name;
    }
    void moving(){
        System.out.println(this.name + " is moving");
    }

     void go(){
        System.out.println("the " + this.name + " is moving");
    }
}