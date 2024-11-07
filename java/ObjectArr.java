public class ObjectArr{
    public static void main(String[] args){
        Person p1 = new Person("rodelyn", 21);
        Person p2 = new Person("venus", 8);

        Person[] objArr = {p1,p2};
        System.out.println("Names: ");
        System.out.println(objArr[0].fname);
        System.out.println(objArr[1].fname);

        System.out.println("Age: ");
        System.out.println(objArr[0].age);
        System.out.println(objArr[1].age);
    }
}

class Person{
    String fname;
    int age;

    Person(String fname, int age){
        this.fname = fname;
        this.age = age;
    }
}