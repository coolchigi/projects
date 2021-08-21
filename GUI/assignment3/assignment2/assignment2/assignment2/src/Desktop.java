public class Desktop extends PersonalComputer {
    private String profile;


    public Desktop(double price, int quantity, double cpuSpeed, int ram, boolean SSD,
                   int storage, String profile){
        super(price,  quantity,  cpuSpeed,  ram, SSD, storage);

        this.profile = profile;

    }

    public String toString(){
        return profile + " Desktop" + super.toString();
    }





}

