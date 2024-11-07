public class Objj{
    public static void main(String[] args){
        Animal obj1 = new Animal("cat");
        Animal obj2 = new Animal("dog");
        Animal obj3 = new Animal("cow");
        Animal obj4 = new Animal("bird");
        Animal obj5 = new Animal("shark");

        Animal[] animals = {obj1,obj2, obj3, obj4, obj5};

        System.out.println(animals[0].name);
        System.out.println(animals[1].name);
        System.out.println(animals[2].name);
        System.out.println(animals[3].name);
        System.out.println(animals[4].name);
    }
}

class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
}