public class OOP{
    public static void main(String[] args){
       Car obj= new Car();

       String name = obj.name;
       String last = obj.lname;
       int age = obj.age;

       System.out.println("My name is " + name);
       System.out.println("My last name is " + last);
       System.out.println("I am " + age + " years old");

       obj.eat();
       obj.sleep();

       System.out.println(obj.add(5,7));

    }
}

class Car{
    String name = "rodelyn";
    String lname = "malunes";
    int age = 21;
    
    void sleep(){
        System.out.println("I like sleeping");
    }

    void eat(){
        System.out.println("I like sleeping");
    }

    int add(int a, int b){
        return a + b;
    }
}