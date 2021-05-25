public class ElectronicStore {
    private String name;
    private final int MAX_PRODUCTS;
    private double revenue;
    private Product[] products;


    public ElectronicStore(String name) {
        this.name = name;
        MAX_PRODUCTS = 10;
        products = new Product[MAX_PRODUCTS];
        revenue = 0;





    }

    public String getName(){
        return name;
    }

    public boolean addProduct(Product p){
        for(int i = 0; i < MAX_PRODUCTS; i++){
            if(products[i] == null){
               products[i] = p;
                return true;
            }

        }
        return false;
    }

    public double getRevenue() {
        return revenue;
    }

    public boolean sellProducts(int item, int amount){
        if(amount > 0){
            if(item >= 0 && item <= 10 && products[item]!= null){
                revenue += products[item].sellUnits(amount);
                products[item].setSoldQuantity(amount);
            }
        }

        return true;
    }

    public void printStock(){
        for(int i = 0; i < MAX_PRODUCTS; i++){
            if(products[i] != null)
            System.out.println(i + ". " + products[i]);
        }
    }


    }

