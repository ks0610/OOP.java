public class carL14 {
    
    private String make;
    private String model;
    private int year;

    carL14(String make, String model, int year){
        //this.make = make;
        //this.model = model;
        //this.year = year;

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    //copy method
    public void copy(carL14 x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

    //getter methods
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }


    //setter methods
    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model; 
    }

    public void setYear(int year){
        this.year = year; 
    }
}





