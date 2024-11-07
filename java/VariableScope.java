import java.util.Random;
public class VariableScope{
    public static void main(String[] args){
        Random rand = new Random();

        //local variable scope
        RandomNumber obj = new RandomNumber();

    }
}

class RandomNumber{

    RandomNumber(){
        Random rand = new Random();
        int number = 0;
        roll(rand, number);
    }

    void roll(Random rand, int number){
        number = rand.nextInt(6) + 1;
        System.out.println(number);
    }
}