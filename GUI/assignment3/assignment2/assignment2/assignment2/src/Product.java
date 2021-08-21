public class Product {
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

    public double sellUnits(int amount){

        if(stockQuantity >= amount){  //The store quantity has to be greater than
            // the amount that should be sold

             double revenue = amount * price;
            stockQuantity -= amount; //Reduce amount by items purchased
            return revenue;


        }
        return -1.0;

    }

    public String toString(){
        return String.format("("+ "%.1f dollars each," + " %.0f in stock " + "%.0f sold" + ")", getPrice(), getStockQuantity(), getSoldQuantity());
    }
}
