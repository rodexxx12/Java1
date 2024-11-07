public class ArrayOfObject{
    public static void main(String[] args){
        Person[] obj = new Person[3];

        Person one = new Person("rodelyn", "malunes", "blue", 21, 23.23);
        Person two = new Person("third", "ricarse", "red", 5, 12.23);
        Person three = new Person("samsy", "ricarse", "pink", 11, 20.23);

        obj[0] = one;
        obj[1] = two;
        obj[2] = three;

        System.out.println(obj[0].fname);
        System.out.println(obj[0].lname);
        System.out.println(obj[0].color);
        System.out.println(obj[0].age);
        System.out.println(obj[0].weight);

        System.out.println();

        System.out.println(obj[1].fname);
        System.out.println(obj[1].lname);
        System.out.println(obj[1].color);
        System.out.println(obj[1].age);
        System.out.println(obj[1].weight);

        System.out.println();

        System.out.println(obj[2].fname);
        System.out.println(obj[2].lname);
        System.out.println(obj[2].color);
        System.out.println(obj[2].age);
        System.out.println(obj[2].weight);

    }
}

class Person{
    String fname;
    String lname;
    String color;
    int age;
    double weight;

    Person(String fname, String lname, String color, int age, double weight){
        this.fname = fname;
        this.lname = lname;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
}