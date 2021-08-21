import java.util.ArrayList;
import java.util.Scanner;

/*Good+day TA marking my work.
I left in some methods from A2 as they caused some errors in the storeSellingTester and StockTester respectively.
Hope I wont lose marks. Thank you :) */
public class ElectronicStore {
    private String name;
    private final int MAX_PRODUCTS = 10;
    private double revenue;

    private int numSales;
    private ArrayList<Product> itemsInCart;
    private Product[] products;

    public ElectronicStore(String name) {
        numSales = 0;
        revenue = 0.0;
        this.name = name;
        products = new Product[MAX_PRODUCTS];

        itemsInCart = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public double getRevenue() {
        return revenue;
    }

    public boolean addProduct(Product p) {
        //In this method, we iterate the array from left to right
        //Once we found a null spot, we set our product there and return true,
        // We return false when the array is full so that nothing is set
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            if (products[i] == null) {
                products[i] = p;
                return true;
            }
        }
        return false;
    }

    public Product[] getProduct() {
        return products;
    }

    public void removeFromCart(int index) {
     /*  The item we want to remove would be at a particular index
        We use this line below to get the index and call the method increaseStockQty
        that increases the stock quantity.
        When an item is removed from the cart, we want to increase it's quantity in the cart'
        */
        itemsInCart.get(index).increaseStockQuantity();
        itemsInCart.remove(index); //This is how to remove items from an Arraylist
    }

    public ArrayList<Product> getItemsInCart() {
        return itemsInCart;
    }

    public Product[] getProducts() {
        int count = 0; //Keep track of the index
        for (Product product : products) { //iterate over the products
            if (product != null && product.getStockQuantity() != 0) { //If null objects are not found, increase the counter. If ten products are non-nulls, count would be 10
                count++;
            }
        }
        Product[] products1 = new Product[count];
        count = 0; //to keep track of the index(index starts at zero)
        for (Product product : products) {
            if (product != null && product.getStockQuantity() != 0) {
                products1[count++] = product;
            }
        }
        return products1;
    }

    public double totalOfCart() {
        /*This method determines the cost of the products in the cart;
        I set a variable to hold our revenue then we iterate over the items in a cart;
        Then add_up the price of those items as that is the total cost of the cart;*/
        double total = 0;
        for (Product cartItems : itemsInCart) {
            total += cartItems.getPrice();
        }
        return total;
    }

    //Method that gives the number of sales tht occurred
    public int getNumSales() {
        return numSales;
    }

    /*//Sells product and updates the revenue when a sale occurs.
     I want to sell a particular unit of the product*/
    public void sellProducts(Product product, int i) {
        revenue += product.sellUnits(i);
    }

    public void sellItemsInCart(){
        /*//Here we want to iterate over the items in the cart and sell the product.
        increase the num_of_sales to reflect the change*/
        for (Product product : itemsInCart) { //change this for_loop
            sellProducts(product, 1);
        }
        numSales += 1;
    }

    public ArrayList<Product> mostPopularProducts() {
        //Store the 1st three products as popular
        ArrayList<Product> popularProducts = new ArrayList<>();
        Product first = products[0]; //Rep the first popular product in stock
        Product second = products[1]; //Rep the second popular product in stock
        Product third = products[2]; //Rep the third popular product in stock
        popularProducts.add(first);  //Add them to the popularProducts list as that is empty atm
        popularProducts.add(second);
        popularProducts.add(third);

        for (int i = 0; i < getProduct().length; i++) {
            if (products[i] != null) { //to make sure the product is not null as the products array contains null spots
                /*The most popular products are the ones that have the highest soldQuantity
                So here, I compared the soldQuantity of each product and change the most popular product when a product with > soldQuantity is found
                Problems encountered: I got a null pointer exception when I used products.length inside the for_loop
                The if statement ensures the top_most popular items are picked*/
                if (products[i].getSoldQuantity() > first.getSoldQuantity()) {
                    first = products[i]; //This is the proper way of storing items. Doing this the other way(products[i] = first) ensues double_counting
                } else if (products[i].getSoldQuantity() > second.getSoldQuantity()) {
                    second = products[i];
                } else if (products[i].getSoldQuantity() > third.getSoldQuantity())
                    third = products[i];
            }
        }
        popularProducts.set(1, second);
        popularProducts.set(0, first); //This is a way to set an object at a particular index in the Arraylist
        popularProducts.set(2, third);
        return popularProducts;
    }

    public boolean sellProducts() {
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

    public boolean sellProducts(int item, int amount) {
        //item rep the product index
        if (item >= 0 && item < 10 && products[item] != null) { //We need to check that the
            // item is valid(index) and that there are no empty spots in the array
            Product p = products[item];//When the above condition is satisfied,p would be populated with
            // the indexes that satisfies the condition
            // So we check that p's not null.
            if (p != null) { //Now we want to make sure, p is not null
                if (amount > 0 && amount <= p.getStockQuantity()) { //Amount has to be < store's quantity
                    revenue += p.sellUnits(amount); //We need to update the revenue by the amount sold
                    p.setSoldQuantity(amount);
                }
            }
            return true;
        }
        return false;
    }

    public void printStock() {
        //Here we only want to print non-nulls, so we iterate
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            if (products[i] != null) {
                System.out.println(i + ". " + products[i]);
            }
        }
    }


    public static ElectronicStore createStore() {
        ElectronicStore store1 = new ElectronicStore("Watts Up Electronics");
        Desktop d1 = new Desktop(100, 10, 3.0, 16, false, 250, "Compact");
        Desktop d2 = new Desktop(200, 10, 4.0, 32, true, 500, "Server");
        Laptop l1 = new Laptop(150, 10, 2.5, 16, true, 250, 15);
        Laptop l2 = new Laptop(250, 10, 3.5, 24, true, 500, 16);
        Fridge f1 = new Fridge(500, 10, 250, "White", "Sub Zero", 15.5, false);
        Fridge f2 = new Fridge(750, 10, 125, "Stainless Steel", "Sub Zero", 23, true);
        ToasterOven t1 = new ToasterOven(25, 10, 50, "Black", "Danby", 8, false);
        ToasterOven t2 = new ToasterOven(75, 10, 50, "Silver", "Toasty", 12, true);
        store1.addProduct(d1);
        store1.addProduct(d2);
        store1.addProduct(l1);
        store1.addProduct(l2);
        store1.addProduct(f1);
        store1.addProduct(f2);
        store1.addProduct(t1);
        store1.addProduct(t2);
        return store1;


    }
}










/*
Reflection and Lessons learned:
Button pane really gave me the most problems. Couldn't get somethings to work.
Wasnt able to click on some products cuz they were overlapping with the innerPane.
Stuck on this for daysss.
Update method was another challenge. Broke my code multiple times, thank God I was able to fix it.
Always test.
Plan dont just write code.
2hrs of sleep isnt healthy. have a better sleep schedule
Attend office hours EARLY! */
