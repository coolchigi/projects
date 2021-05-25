public abstract class PC extends Product {
    private int storageAm, rAM;
    private double cpuSpeed;
    private boolean isSSD;


    public PC(double price, int quantity, double cpuSpeeds, int rAM, boolean isSSD,
              int storageAm){
        super(price, quantity);
        this.cpuSpeed = cpuSpeeds;
        this.rAM = rAM;
        this.storageAm = storageAm;
        this.isSSD = isSSD;


    }



    public int getStorageAm() {
        return storageAm;
    }

    public int getrAM() {
        return rAM;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }



    public String toString(){
        return String.format("PC with %sghz CPU, %dGB RAM, %sGB %s",getCpuSpeed(), getrAM(),
                getStorageAm(),isSSD() + super.toString());
    }

    public String isSSD(){
        if(isSSD){
            return "SSD drive";
        }
        else{
            return "HDD drive";
        }

    }


}
