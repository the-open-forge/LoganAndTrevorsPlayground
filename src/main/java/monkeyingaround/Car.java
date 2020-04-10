package monkeyingaround;

public class Car {
    private String color;
    private String make;
    private String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        String toReturn = "     Car: " + '\n';
        toReturn += "Color: " + this.color + '\n';
        toReturn += "Make: " + this.make + '\n';
        toReturn += "Model: " + this.model + '\n';
        toReturn += "This is a nice car!";
        return toReturn;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
