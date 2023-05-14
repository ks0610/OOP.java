public class Main9 {
    public static void main(String[] args){

        //inheritence = where one class takes on the attributes and methods of another class

        carL9 car = new carL9();
        car.go();

        bicycleL9 bicycle = new bicycleL9();
        bicycle.stop();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);
        System.out.println(car.doors);
        System.out.println(bicycle.pedals);
    }
}
