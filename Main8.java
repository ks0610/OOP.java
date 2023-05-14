public class Main8{
    public static void main(String[] args){

        friendL8 friend1 = new friendL8("Jordan");
        friendL8 friend2 = new friendL8("Alannah");

        //accessing the static variable numberOfFriends, to access it use prefix of the name of the class 
        System.out.println(friendL8.numberOfFriends);


        System.out.println(friend1.name);
        System.out.println(friend2.name);


    }

}