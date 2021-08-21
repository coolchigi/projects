public  abstract class Product {
    //This is the superclass for personal_comp and appliance
    //The shared attributes are price and quantity
    //Abstract because we are not instantiating
    private double price;
    private double stockQuantity;
    private double soldQuantity;

    public void setSoldQuantity(double soldQuantity) {
        this.soldQuantity = soldQuantity;
    }


    public Product(double price, int quantity){
        this.price = price;
        this.stockQuantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getStockQuantity() {
        return stockQuantity;
    }

    public double getSoldQuantity() {
        return soldQuantity;
    }



    //The stockQuantity has to decrease by 1
    public void decreaseStockQuantity(){
        stockQuantity -= 1;
    }
    //The stockQuantity has to increase by 1
    public void increaseStockQuantity(){
        stockQuantity += 1;
    }

    public double sellUnits(int amount){
        if(amount > 0 && stockQuantity >= amount){
            soldQuantity += amount;
            return price * amount;
        }
        return 0.0;

    }

    public String toString(){
        return String.format("("+ "%.1f dollars each," + " %.0f in stock " + "%.0f sold" + ")", getPrice(), getStockQuantity(), getSoldQuantity());
    }
}
