public class Contructors{
    public static void main(String[] args){
        Human obj1 = new Human("rodelyn", "malunes", 21, 55.3);
        
        String name = obj1.name;
        String lname = obj1.lname;
        int age = obj1.age;
        double weight = obj1.weight;

        System.out.println("My name is "+ name);
        System.out.println("My last name is " + lname);
        System.out.println("I am "+ age + " years old");
        System.out.println("My weight is " + weight + " kilo");

        obj1.display();
       
        System.out.println(obj1.age());
        System.out.println(obj1.weight());

    }
}

class Human{
    
    String name;
    String lname;
    int age;
    double weight;

    Human(String name, String lname, int age, double weight){
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.weight = weight;
    }

    void display(){
        System.out.println(this.name + " love sleeeeeping");
    }

    int age(){
        return this.age;
    }
    double weight(){
        return this.weight;
    }
}