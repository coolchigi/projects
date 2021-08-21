import java.util.Scanner;

public class ElectronicStore {

    //I don't get why I keep getting "field....may be final"

    private String name;
    private int MAX_PRODUCTS = 10;
    private double revenue = 0;
    private Product[] products;




    public ElectronicStore(String name){
        this.name = name;
        products =  new Product[MAX_PRODUCTS];

}
    public String getName() {
        return name;
    }

    public double getRevenue() {
        return revenue;
    }



    public boolean addProduct(Product p){
        //In this method, we iterate the array from left to right
        //Once we found a null spot, we set our product there and return true,
        // We return false when the array is full so that nothing is set
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            if(products[i] == null){
                products[i] = p;
                return true;
            }
        }
        return false;
    }




    public void printStock(){
        //Here we only want to print non-nulls, so we iterate
        for(int i = 0; i < MAX_PRODUCTS; i++){
            if(products[i] != null){
                System.out.println(i + ". " + products[i]);
            }
        }


    }





    public boolean sellProducts(int item, int amount){
       //item rep the product index
            if(item >= 0 && item < 10 && products[item] != null){ //We need to check that the
                // item is valid(index) and that there are no empty spots in the array
                Product p = products[item];//When the above condition is satisfied,p would be populated with
                // the indexes that satisfies the condition
                // So we check that p's not null.
                if (p != null) { //Now we want to make sure, p is not null
                    if(amount > 0 && amount <= p.getStockQuantity()){ //To make sure the amount is valid.Amount has to be < store's quantity
                        revenue += p.sellUnits(amount); //We need to update the revenue by the amount sold
                        p.setSoldQuantity(amount);
                    }
                }
                return true;
            }
            return false;





    }



    public boolean sellProducts(){
        //Printout the products and assign a number to each one
        //Ask for user input
        printStock();
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the item's index: ");
        int item = user.nextInt();
        System.out.println("Enter the quantity: ");
        int amount = user.nextInt();

        return sellProducts(item, amount);
    }


}
