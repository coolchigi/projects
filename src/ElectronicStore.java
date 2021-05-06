
    public class ElectronicStore {
    private String name;
    Object[] products = new Object[9];

    public ElectronicStore(String name) {
        this.name = name;


        products[0] = new Desktop(6.5, 9, 900, true);
        products[1] = new Desktop(10, 20, 500, false);
        products[2] = new Desktop(40, 23, 237, true);

        products[3] = new Laptop(23, 54.8, 5, 530, true);
        products[4] = new Laptop(15, 23.2, 32, 235, false);
        products[5] = new Laptop(30, 40.3, 15, 900, true);
        
        products[6] = new Fridge(34.23, "Hot-Pink", true);
        products[7] = new Fridge(74.10, "Aqua-Black", false);
        products[8] = new Fridge(65.65, "White", true);


    }

    public void printStock() {
        for (Object items : products) {
            System.out.println(items);
        }
    }

    public boolean searchStock(String searchItem) {
        for (Object item : products) {
            if (item.toString().toLowerCase().contains(searchItem.toLowerCase())) {
                return true;
            }

        }
        return false;
    }

        public String toString () {
            return this.name;
        }
    }

