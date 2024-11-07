public class Encapsulation2{
    public static void main(String[] args){
        Numbers obj = new Numbers(1,2,3,4,5);

          obj.setNumber1(6);
          obj.setNumber2(7);
          obj.setNumber3(8);
          obj.setNumber4(9);
          obj.setNumber5(10);

          System.out.println(obj.getNumber1());
          System.out.println(obj.getNumber2());
          System.out.println(obj.getNumber3());
          System.out.println(obj.getNumber4());
          System.out.println(obj.getNumber5());



    }
}

class Numbers{
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;

    Numbers(int number1, int number2, int number3, int number4, int number5){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
    }

    public int getNumber1(){
        return number1;
    }

    public int getNumber2(){
        return number2;
    }

    public int getNumber3(){
        return number3;
    }

    public int getNumber4(){
        return number4;
    }

    public int getNumber5(){
        return number5;
    }

    public void setNumber1(int number1){
        this.number1 = number1;
    }

    public void setNumber2(int number2){
        this.number2 = number2;
    }

    public void setNumber3(int number3){
        this.number3 = number3;
    }

    public void setNumber4(int number4){
        this.number4 = number4;
    }

    public void setNumber5(int number5){
        this.number5 = number5;
    }
}