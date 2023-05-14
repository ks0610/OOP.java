public class Main13{
    public static void main(String[] args){

        //encapsulation = attributes of a class will be hidden or private,
        //                Can be accessed only through methods (getter & Setters)
        //                You should make attriubtes private if you don't have a reason to make them public/protected

        CarL13 car = new CarL13("Seat", "Ibiza", 2022);

        //the below line will not work, as make is a private attribute, so only CarL13 class has access to it
        //System.out.println(car.make);

        //instead we must use the getter method defined within the carL13 clas
        System.out.println(car.getMake());

        //similarly, the below line will not work, as year is set to private
        // car.year = 2023

        //instead we must use the setter method defined within the CarL13 class
        car.setYear(2023);
        System.out.println(car.getYear());

    }


}