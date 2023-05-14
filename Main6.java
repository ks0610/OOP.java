public class Main6 {
    public static void main(String[] args){

        //creating an array of objects:

        //foodL6[] refrigerator = new foodL6[3];

        foodL6 food1 = new foodL6("pizza");
        foodL6 food2 = new foodL6("burgers");
        foodL6 food3 = new foodL6("chips");

        foodL6[] refrigerator = {food1,food2,food3};

        //refrigerator[0]= food1;
        //refrigerator[1]= food2;
        //refrigerator[2]= food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
}
