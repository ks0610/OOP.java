public class carL12 extends vehicleL12{

    //go method must be overriden, as go is an abstract method, to make it specific to cars
    @Override
    void go(){
        System.out.println("The driver is driving the car");
    }

}