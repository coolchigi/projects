import java.util.Arrays;

public class RandomTester {

    public static void main(String[] args){
        ElectronicStore something = new ElectronicStore("ME");
        something = ElectronicStore.createStore();
        //System.out.println(Arrays.toString(something.getProductList()));
        //System.out.println(Arrays.toString(something.getProductList()));
        //System.out.println(Arrays.toString(something.removeProduct(1)));
        System.out.println(Arrays.toString(something.getProducts()));

        //System.out.println(something.getProductsList());
        
        something.printStock();







    }
}
