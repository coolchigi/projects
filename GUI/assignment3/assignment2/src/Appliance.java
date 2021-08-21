public abstract class Appliance extends Product {
    //This is an abstract class because we are not instantiating
    //PersonalComp would extends this and fridge too
    //It will have those attributes similar to fridge and personalComp

    private String color;
    private String brand;
    private int wattage;

    public Appliance(double price, int quantity, int wattage, String color, String brand){
        super(price, quantity);
        this.brand = brand;
        this.color = color;
        this.wattage = wattage;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getWattage() {
        return wattage;
    }

    public String toString() {
        return String.format("(%s, %s watts) " + super.toString(),  getColor(), getWattage());
    }
}
