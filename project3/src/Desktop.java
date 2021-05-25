public class Desktop extends PC {

    private String profile;


    public Desktop(double price, int quantity, double cpuSpeeds, int rAM, boolean isSSD,
                   int storageAm, String profile) {
        super(price, quantity, cpuSpeeds, rAM, isSSD, storageAm);
        this.profile = profile;
    }

    public String toString(){
        return this.profile + " Desktop " + super.toString();
    }



}