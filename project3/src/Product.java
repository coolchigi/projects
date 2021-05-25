public abstract class Product {
//    Super class
    private double price;
    private int soldQuantity, stockQuantity;

    public Product(double price, int quantity){
        this.price = price;
        this.stockQuantity = quantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public double sellUnits(int amount){

        if(stockQuantity >= amount){
        /*  Increase the soldQuantity by the amount sold */
            soldQuantity += amount;
            stockQuantity -= amount;
            return amount * price;
        }
        return 0;

    }

    public String toString(){
        return String.format(" (%s dollars each, %s in stock, %s sold)", getPrice(),
                getStockQuantity(), getSoldQuantity());
    }

    public int getSoldQuantity(){
        return soldQuantity;
    }

    public int getStockQuantity(){
        return stockQuantity;
    }

    public double getPrice(){
        return price;
    }


}
