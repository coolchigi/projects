public class Laptop extends PersonalComputer {

    private double screenSize;

    public Laptop(double price, int quantity, double cpuSpeed, int ram, boolean SSD,
                  int storage,double screenSize){
        super(price,  quantity,  cpuSpeed,  ram, SSD, storage);
        this.screenSize = screenSize;


    }

    public String toString(){
        return screenSize + " inch Laptop" + super.toString();
    }


    }








