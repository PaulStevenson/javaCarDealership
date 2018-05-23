import com.sun.org.apache.xpath.internal.operations.Mod;
import eNums.Make;
import eNums.Model;
import eNums.Type;

public class Vehicle {
    
    private Type type;
    private Make make;
    private Model model;
    private double price;
    private String colour;
    
    public Vehicle(Type type, Make make, Model model, double price, String colour){
        this.type = type;
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public Type getType() {
        return type;
    }

    public Make getMake() {
        return make;
    }

    public Model getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
