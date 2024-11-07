public class Super{
    public static void main(String[] args){
     Dog obj = new Dog("gosss", 34, "red");
     System.out.println(obj);

    }
}

class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
}

class Dog extends Animal{
    String color;

    Dog(String name, int age, String color){
        super(name,age);
        this.color = color;
    }

    public String toString(){
        return super.toString()  + this.color;
    }
}