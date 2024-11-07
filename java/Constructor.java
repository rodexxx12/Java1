public class Constructor{
    public static void main(String[] args){
        Pizza pizza = new Pizza("Peperonni", "tomato", "mozerelle", "bacon", 3000);
       
       if(args.length == 0){
        System.out.println("no args provided");

       }else if(args[0].equals("option1")){
        System.out.println(pizza.name);

       }else if(args[0].equals("option2")){
        System.out.println(pizza.name);
        System.out.println(pizza.sauce);

       }else if(args[0].equals("option3")){
        System.out.println(pizza.name);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);

       }else if(args[0].equals("option4")){
        System.out.println(pizza.name);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);

       }else if(args[0].equals("option5")){
        System.out.println(pizza.name);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);
        System.out.println(pizza.price);

       }else{
        System.out.println("errr");
       }
    }
}

class Pizza{

    String name;
    String sauce;
    String cheese;
    String toppings;
    int price;

    Pizza(String name){
        this.name = name;
    }

    Pizza(String name, String sauce){
        this.name = name;
        this.sauce = sauce;
    }

    Pizza(String name, String sauce, String cheese){
        this.name = name;
        this.sauce = sauce;
        this.cheese = cheese;
    }


    Pizza(String name, String sauce, String cheese, String toppings){
        this.name = name;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }


    Pizza(String name, String sauce, String cheese, String toppings, int price){
        this.name = name;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
        this.price = price;
    }


}