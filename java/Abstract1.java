public class Abstract1{
    public static void main(String[] args){
        
        if(args.length == 0){
            System.out.println("no args provided");
        }else if(args[0].equals("Person1")){
            Person1 obj = new Person1("rode", 23);
            obj.dancing();
            obj.kindPerson();
        }else if(args[0].equals("Person2")){
            Person2 obj1 = new Person2("third", 3);
            obj1.dancing();
            obj1.smartPerson();
        }else if(args[0].equals("Person3")){
            Person3 obj2 = new Person3("samsy", 2);
            obj2.dancing();
            obj2.shyPerson();
        }else{
            System.out.println("error");
        }
    }
}

interface kind{

    void kindPerson();
}

interface smart{
    
    void smartPerson();
}

interface shy{

    void shyPerson();
}

abstract class Dancing{

    abstract void dancing();
}

abstract class Singing{

    abstract void dancing();
}

class Person1 extends Dancing implements kind{
    String name;
    int age = 0;

    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    void dancing(){
        System.out.println(this.name + " is dancin...");
    }

    public void kindPerson(){
        System.out.println(this.name + " is a kind person");
    }
}

class Person2 extends Dancing implements smart{
    String name;
    int age = 0;

    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    void dancing(){
        System.out.println(this.name + " is dancin...");
    }

    public void smartPerson(){
        System.out.println(this.name + " is a smart person");
    }
}

class Person3 extends Dancing implements shy{
    String name;
    int age = 0;

    Person3(String name, int age){
        this.name = name;
        this.age = age;
    }

    void dancing(){
        System.out.println(this.name + " is dancin...");
    }

    public void shyPerson(){
        System.out.println(this.name + " is a shy person");
    }
}