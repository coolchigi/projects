public class Fridge extends HomeAppliance{
    private double fridgeSize;
    private boolean hasFreezer;

    public Fridge(double price, int quantity,int wattage, String colorF, String brand, double fridgeSize,
                  boolean hasFreezer){
        super(price,quantity,wattage,colorF,brand);
        this.hasFreezer = hasFreezer;
        this.fridgeSize = fridgeSize;
    }

    public String toString(){
        return fridgeSize + "cu. ft." + getBrand() + isPresentDet() + super.toString();
    }

    public String isPresentDet(){
        if(hasFreezer){
            return " Fridge with Freezer";
        }
        else{
            return " Fridge";
        }
    }

}

