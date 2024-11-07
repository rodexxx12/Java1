public class Encapsulation1{
    public static void main(String[] args){
        Animal obj = new Animal("mammal", "brown", 600);
        obj.setType("reptile");
        obj.setColor("blue");
        obj.setAge(10000);

        System.out.println(obj.getType());
        System.out.println(obj.getColor());
        System.out.println(obj.getAge());
    }
}

class Animal{
    private String type;
    private String color;
    private int age;
    

    Animal(String type, String color, int age){
       this.setType(type);
       this.setColor(color);
       this.setAge(age);
    }

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }
}