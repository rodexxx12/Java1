public class Inheritance{
    public static void main(String[] args){
      Cat obj = new Cat("kitty");
      obj.play();
      System.out.println(obj.name);
      System.out.println(obj.color);
      System.out.println(obj.types);
      obj.displayNN();

      Dog obgDog = new Dog();
      obj.play();

      Fish objFish = new Fish();
      obj.play();

      Rabbit objR = new Rabbit();
      objR.play();

      Bird objBird = new Bird();
      objBird.play();
    }
}

class Animal{
    String name = "cat";
    String color = "red";
    String types = "mammal";

    void play(){
        System.out.println("playingggg");
    }
    void color(){
        System.out.println("colorrrrr");
    }
}

class Cat extends Animal{
    String happy = "yes";
    String nn;
    Cat(String nn){
        this.nn = nn;
    }

    void displayNN(){
        System.out.println("my name is " + this.nn);
    }
}

class Dog extends Animal{

}

class Rabbit extends Animal{

}

class Bird extends Animal{

}

class Fish extends Animal{

}