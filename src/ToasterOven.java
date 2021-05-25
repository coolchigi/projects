public class ToasterOven extends HomeAppliance{

    private boolean hasConvection;

    private int width;

    public ToasterOven(double price, int quantity, int wattage, String colorF, String brand, int width,
                       boolean hasConvection){
        super(price,quantity,wattage,colorF,brand);
        this.hasConvection = hasConvection;
        this.width = width;



    }

    public String toString(){
        return width + " inch " + getBrand() + hasCon() + super.toString();

    }

    public String hasCon(){
        if(hasConvection){
            return " Toaster with convection";
        }
        else{
            return " Toaster";
        }
    }
}
