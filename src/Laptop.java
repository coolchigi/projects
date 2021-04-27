public class Laptop  {

    //int ScreenSize;
     double cpuSpeed; //To access it outside the class
     int RAM, storage, screenSize;
    //int Storage;


    boolean hardDrive;


    public Laptop(int screenSize,double cpuSpeed, int RAM, int storage, boolean hardDrive){
        this.cpuSpeed = cpuSpeed;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.storage = storage;

        this.hardDrive = hardDrive;


    }


    public String toString() {
        String laptop = this.storage + "GB ";

        if(!this.hardDrive){
            laptop = laptop + "HDD drive";
        }else{
            laptop = laptop + "SSD drive";
        }

        return this.screenSize + "\""  + " Laptop PC with " + this.cpuSpeed + "ghz CPU, " + this.RAM +
                "GB" + " RAM, " + laptop;

    }





}
