public class ObjPassing{
    public static void main(String[] args){
        Play action = new Play();

        Animal animal1 = new Animal("cat");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("whale");
        Animal animal4 = new Animal("shark");
        Animal animal5 = new Animal("birds");


        action.running(animal1);
        action.play(animal2);
        action.play(animal3);
        action.play(animal4);
        action.play(animal5);

    }
}

class Animal{
    String name;

    Animal(String name){
        this.name = name;
    } 
}

class Play{

    public void play(Animal obj){
        System.out.println(obj.name + " is playing...");
    }

    void running(Animal obj){
        System.out.println(obj.name + " is running");
    }
}