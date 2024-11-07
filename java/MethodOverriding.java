public class MethodOverriding{
    public static void main(String[] args){
        Animal obj = new Animal();
        obj.displayAnimal();

        Dog obj1 = new Dog();
        obj1.displayAnimal();

        Cat obj2 = new Cat();
        obj2.displayAnimal();
    }
}

class Animal{

    void displayAnimal(){
        System.out.println("this is an Animal");
    }
}

class Dog extends Animal{

    void displayAnimal(){
        System.out.println("this is a dog");
    }

}

class Cat extends Animal{

    void displayAnimal(){
        System.out.println("this is a cat");

    }
}