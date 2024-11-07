import java.util.Scanner;
public class Overloading{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        if(args.length == 0){

            System.out.println("no args provided");

        }else if(args[0].equals("two")){

            System.out.print("Enter number 1: ");
            int num1 = scan.nextInt();

            System.out.print("Enter number 2: ");
            int num2 = scan.nextInt();

            System.out.println(sum(num1, num2));

        }else if(args[0].equals("three")){

            System.out.print("Enter number 1: ");
            int num1 = scan.nextInt();

            System.out.print("Enter number 2: ");
            int num2 = scan.nextInt();

            System.out.print("Enter number 3: ");
            int num3 = scan.nextInt();

            System.out.println(sum(num1, num2, num3));

        }else if(args[0].equals("four")){

            System.out.print("Enter number 1: ");
            int num1 = scan.nextInt();

            System.out.print("Enter number 2: ");
            int num2 = scan.nextInt();

            System.out.print("Enter number 3: ");
            int num3 = scan.nextInt();

            System.out.print("Enter number 4: ");
            int num4 = scan.nextInt();

            System.out.println(sum(num1, num2, num3, num4));

        }else if(args[0].equals("five")){

            System.out.print("Enter number 1: ");
            int num1 = scan.nextInt();

            System.out.print("Enter number 2: ");
            int num2 = scan.nextInt();

            System.out.print("Enter number 3: ");
            int num3 = scan.nextInt();

            System.out.print("Enter number 4: ");
            int num4 = scan.nextInt();

            System.out.print("Enter number 5: ");
            int num5 = scan.nextInt();

            System.out.println(sum(num1, num2, num3, num4, num5));
        }else{
            System.out.println("errr");
        }

    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
    static int sum(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }
}