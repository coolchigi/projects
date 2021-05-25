public abstract class HomeAppliance extends Product{
    private double  price;
    private String colorF;
    private String brand;
    private int wattage;

    public HomeAppliance(double price, int quantity,int wattage, String colorF, String brand){
        super(price,quantity);
        this.price = price;
        this.colorF = colorF;
        this.brand = brand;
        this.wattage = wattage;


    }

    public String getColorF() {
        return colorF;
    }

    public String getBrand() {
        return brand;
    }

    public int getWattage() {
        return wattage;
    }

    public String toString(){
        return String.format(" (%s, %s watts) %s ",getColorF(), getWattage(), super.toString() );
    }
}
