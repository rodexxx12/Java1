public class Static{
    public static void main(String[] args){
        Friend p1 = new Friend("anna");
        Friend p2 = new Friend("leonora");
        Friend p3 = new Friend("therese");
        Friend p4 = new Friend("anna");
        Friend p5 = new Friend("leonora");
        Friend p6 = new Friend("therese");
        Friend p7 = new Friend("anna");
        Friend p8 = new Friend("leonora");
        Friend p9 = new Friend("therese");

        Friend.displayFriends();
    }
}

class Friend{
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " number of friends");
    }

}