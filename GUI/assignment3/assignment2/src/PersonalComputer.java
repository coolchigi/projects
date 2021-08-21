public abstract class PersonalComputer extends Product {
    private double cpuSpeed;
    private int ram;
    private boolean SSD;
    private int storage;

    public PersonalComputer(double price, int quantity ,double
            cpuSpeed, int ram, boolean SSD, int storage) {
        super(price,quantity);
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.SSD = SSD;
        this.storage = storage;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String toString(){
        if(SSD){
            return String.format(" PC with %s gHz CPU, %dGB RAM, %dGB SSD drive, " + super.toString(),
                    getCpuSpeed(),getRam(),getStorage() );
        }
        else{
            return String.format(" PC with %s gHz CPU, %d GB RAM, %dGB HDD drive " + super.toString()

                    , getCpuSpeed(), getRam(), getStorage());
        }
    }


}
