import java.util.Random;
public class VariableScope2{
    public static void main(String[] args){
        Random rand = new Random();
        Number obj = new Number();

        //gobal variable scope
    }
} 

class Number{
    Random rand;
    int number;

    Number(){
       rand = new Random();
       roll();
    }

    void roll(){
        number = rand.nextInt(6) + 1;
        System.out.println(number);
    }
}