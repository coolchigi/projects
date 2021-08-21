public class Fridge extends Appliance {

    private boolean hasFreezer;
    private double cubicFeet;

    public Fridge(double price, int quantity, int wattage, String color, String brand, double cubicFeet,
                  boolean hasFreezer){
        super(price,  quantity,  wattage,  color,  brand);
        this.cubicFeet = cubicFeet;
        this.hasFreezer = hasFreezer;

    }



    public String toString(){
        if(hasFreezer){
            return cubicFeet + " cu. ft. " + getBrand() + " Fridge with Freezer " + super.toString();
        }
        else{
            return cubicFeet + " cubic foot " + getBrand() + " Fridge without Freezer " + super.toString();
        }
    }
}
