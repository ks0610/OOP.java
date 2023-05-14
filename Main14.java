public class Main14 {
    public static void main(String args[]){

        //to copy an object, it would make sense to write car1=car2, this gives the appearance of a copy, but instead just assings the same memory location to each object. 
        //instead we must make a copy method:

        carL14 car1 = new carL14("Seat", "Ibiza",2022);
        carL14 car2 = new carL14("Ford", "Mustang",2023);

        car2.copy(car1);

        //prints address of car1 & car2 in memory
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("");

        //prints make, model, year of car1
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println("");

        //prints make, model, year of car2
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        

    }
}
