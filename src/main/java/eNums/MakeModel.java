package eNums;

public enum MakeModel {

    HATCHBACK("Ford", "Fiesta"),
    SUV("Ford", "Ranger"),
    VAN("Ford", "Connect");

    private String make;
    private String model;

    MakeModel(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }
}
