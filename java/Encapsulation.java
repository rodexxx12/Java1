public class Encapsulation{
    public static void main(String[] args){
        Person p1 = new Person("rode", "malunes", 21);
        
        p1.setFname("althea");
        p1.setLname("ricarse");
        p1.setAge(12);


        System.out.println(p1.getFname());
        System.out.println(p1.getLname());
        System.out.println(p1.getAge());
    }
}

class Person{
    private String fname;
    private String lname;
    private int age;


    Person(String fname, String lname, int age){
        this.setFname(fname);
        this.setLname(lname);
        this.setAge(age);
    }

    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }

    public int getAge(){
        return age;
    }

    public void setFname(String fname){
       this.fname = fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public void setAge(int age){
        this.age = age;
    }
}