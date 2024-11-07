import java.util.Scanner;

public class Methods01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = scan.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();

        if(args.length == 0){
            System.out.println("no args provided");
        }else if(args[0].equals("addition")){
            System.out.println(sum(num1, num2));
        }else if(args[0].equals("subtraction")){
            System.out.println(diff(num1, num2));
        }else if(args[0].equals("multiplication")){
            System.out.println(mul(num1, num2));
        }else if(args[0].equals("division")){
            System.out.println(div(num1, num2));
        }else{
            System.out.println("errrr");
        }

    }
    static int sum(int a, int b){
        return a + b;
    }
    static int diff(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static int div(int a, int b){
        return a / b;
    }
}