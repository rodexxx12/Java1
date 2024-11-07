public class ToString{
    public static void main(String[] args){
        Person obj = new Person();
        //System.out.println(obj.toString());
        System.out.println(obj);

    }
}

class Person{
    String fname = "rodelyn";
    String mname = "magallanes";
    String lname = "malunes";
    int age = 21;
    int byear = 2003;
    String color = "blue";

    public String toString(){
        return fname + "\n" + mname + "\n" + lname + "\n" + age + "\n" + byear + "\n" + color;
    }

}