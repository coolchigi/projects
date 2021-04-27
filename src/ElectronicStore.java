//public class ElectronicStore {
    public class ElectronicStore {
        String name;
        Desktop[] items; //To create 3 items..it's better to declare before instantiating
        Laptop[] items2;
        Fridge[] items3;
    {
        items = new Desktop[3]; //This will store our desktops while the others would store our fridge and laptop respectively
        items2= new Laptop[3];
        items3 = new Fridge[3];
    }


        public ElectronicStore(String name) {
            this.name = name;
            //Array can store items..you create the array before the constructor so they can be accessed throughout the program



            items[0] = new Desktop(3.5, 8, 500, false);
            items[1] = new Desktop(3.0, 16, 250, true);
            items[2] = new Desktop(4.3, 32, 500, true);


            items2[0] = new Laptop(15, 3.1, 32, 500, true);
            items2[1] = new Laptop(13, 2.5, 8, 250, false);
            items2[2] = new Laptop(15, 3.0, 16, 250, true);


            items3[0] = new Fridge(16.5, true, "Black");
            items3[1] = new Fridge(12.0, false, "White");
            items3[2] = new Fridge(23.0, true, "Stainless Steel");
        }


//The method below is used to print the items in the store using the enhanced for loop
        public  void printStock(){

            for (Desktop item : items) {
                System.out.println(item);
            }
            for (Laptop laptop : items2) {
                System.out.println(laptop);
            }
            for (Fridge fridge : items3) {
                System.out.println(fridge);

            }
        }


//This is a searchStock method..it searches the stock and returns true if the item is found and false otherwise.
//My plan was to create a boolean variable found and update it each time a product is found
//If it is found in desktop doesn't mean it would be found in laptop and fridge respectively so we have to loop through and update the found variable as well
//To make comparison easier I converted the toString method and the passed string to lowercase
        public boolean searchStock(String rando){

        boolean found = false; //To set a boolean

            for (Desktop item : items) {
                if (item.toString().toLowerCase().contains(rando.toLowerCase())) {

                    found = true; //Update the boolean as an item has been found
                    //To break out of the loop when an item is found
                    break;
                }

            }//If an item was found in Desktop, we want to search through the fridge and laptop items to see if it's there
            if (!found){//This means if 'true'
                for (Laptop laptop : items2) {
                    if (laptop.toString().toLowerCase().contains(rando.toLowerCase())) {
                        found = true;  //Update the boolean as an item has been found
                        break; //Break out of the loop
                    }
                }

                for (Fridge fridge : items3) {
                    if (fridge.toString().toLowerCase().contains(rando.toLowerCase())) {
                        found = true;
                        break;
                    }

                }
            }//By the time, found comes out of those loops found has been updated(it was not true)..so here instead of saying if !found, we say if found
            //because now found = true
            rando = rando.toLowerCase();
            if(found){
                System.out.println("A matching item is contained " +
                 "in the store's stock");
            }else if(rando.equals("quit")){
                System.exit(0);
            }else{
                System.out.println("No items in the store's stock match that term.");
            }


            return found;//The method must return a boolean
    }
}