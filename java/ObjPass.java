public class ObjPass{
    public static void main(String[] args){
        Type obj = new Type();
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal bird = new Animal("bird");
        Animal fish = new Animal("fish");
        Animal turtle = new Animal("turtle");
       
       if(args.length == 0){
        System.out.println("no args provided");
       }else if(args[0].equals("cat")){
        obj.runs(cat);
       }else if(args[0].equals("dog")){
        obj.walk(dog);
       }else if(args[0].equals("bird")){
        obj.fly(bird);
       }else if(args[0].equals("fish")){
        obj.swim(fish);
       }else if(args[0].equals("turtle")){
        obj.walk(turtle);
       }else{
        System.out.println("errrr");
       }

    }
}

class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
}

class Type{

    void runs(Animal animal){
        System.out.println(animal.name + " is running away");
    }

    void swim(Animal animal){
        System.out.println(animal.name + " is swimming accross the ocean");
    }

    void fly(Animal animal){
        System.out.println(animal.name + " is flying afar");
    }

    void walk(Animal animal){
        System.out.println(animal.name + " walk slowly");
    }


}