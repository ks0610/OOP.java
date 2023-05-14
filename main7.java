public class main7 {
    public static void main(String[] args){

        //instantiating garage object

        garageL7 garage = new garageL7();

        carL7 car1 = new carL7("Ibiza");
        carL7 car2 = new carL7("Polo");

        garage.park(car1);
        garage.park(car2);
    }
}
