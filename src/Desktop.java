public class Desktop {

     double cpuSpeed;
     int RAM, storage;
     boolean hardDrive ;

    public Desktop(double cpuSpeed, int RAM, int storage, boolean hardDrive){
        this.cpuSpeed = cpuSpeed;
        this.RAM = RAM;
        this.storage = storage;
        this.hardDrive = hardDrive;

    }




//This method returns a String representation of the objects
    public String toString() {
        String space = this.storage + "GB ";
        if(!this.hardDrive){ 
            space =  space + "HDD drive";
        }else {
            space = space +  "SSD drive";
        }
        
        return "Desktop PC with " + this.cpuSpeed + "ghz CPU, " + this.RAM +
                "GB RAM, "  + space;

}
}

