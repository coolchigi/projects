public class Desktop {

    private double cpuSpeed;
    private int rAM;
    private int storageAm;
    private boolean isSSD;

    public Desktop(double cpuSpeed, int RAM, int storage, boolean hardDrive){
          /*The this keyword refers to the current object in a method or constructor.*/
        this.cpuSpeed = cpuSpeed;
        this.RAM = RAM;
        this.storage = storage;
        this.hardDrive = hardDrive;

    }




//This method returns a String representation of the objects
    public String toString(){
        String result = "Desktop PC with ";
        result += String.format("%sghz CPU, %sGB RAM, %dGB %s drive.", getCpuSpeed(),getrAM(),getStorageAm(),ssdDet());
        return result;

    }

    public double getCpuSpeed(){
        return cpuSpeed;
    }

    public int getrAM(){
        return rAM;
    }

    public int getStorageAm(){
        return storageAm;
    }

    public boolean getSSD(){
        return isSSD;
    }

    public String ssdDet(){
        if(isSSD){
            return "SSD";
        }
        else{
            return "HDD";
        }
    }
}

