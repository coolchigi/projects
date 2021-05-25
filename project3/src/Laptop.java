public class Laptop extends PC {

    private double screenSize;

    public Laptop(double price, int quantity, double cpuSpeed, int rAM, boolean isSSD,
                  int storageAm, double screenSize){
        /*The this keyword refers to the current object in a method or constructor.*/
        super(price,quantity, cpuSpeed,  rAM,  isSSD, storageAm);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String toString(){
        return screenSize + " Laptop" + super.toString();
    }


    }


















