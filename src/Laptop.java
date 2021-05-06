public class Laptop  {
     double cpuSpeed; 
     int RAM, storage, screenSize;
     boolean hardDrive;


    public Laptop(int screenSize,double cpuSpeed, int RAM, int storage, boolean hardDrive){
        this.cpuSpeed = cpuSpeed;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.storage = storage;
        this.hardDrive = hardDrive;
    }
     
     public int getScreenSize() {
        return screenSize;
    }

    public String toString(){
        String result = "";
        result += String.format("%s\" %s %sghz CPU, %sGB RAM, %sGB %s drive.",getScreenSize(),result(),
                getCpuSpeed(),getrAM(),getStorageAm(),ssdDet());
        return result;


    }
    public String result(){
        return "Laptop PC with";
    }

    public int getrAM(){
        return rAM;
    }
    public int getStorageAm(){
        return storageAm;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public String ssdDet(){
        if(isSSD){
            return "SSD";
        }
        else{
            return "HDD";
        }


    

}
