
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.control.*;

public class ElectronicStoreAppView extends Pane {
   /*Create an instance of the Button Pane class
   This gives you access to the methods in that class
    */
   private  ElectronicStoreButtonPane buttonPane;
   private ElectronicStore model;
   private  ListView<Product> storeStockList, currentCartList, popularItemsList;
   private  TextField totalSales, revenueField, perItemField;
   private Label storeSummary,currentCart, sales, storeStock,perItemS, revenue,
           popularItems;

   public ElectronicStoreButtonPane getButtonPane() {
      return buttonPane;
   }

    public ListView<Product> getStoreStockList() {
        return storeStockList;
    }

    public ListView<Product> getCurrentCart(){
      return currentCartList;
    }

    public ElectronicStoreAppView(ElectronicStore aModel){
       model = aModel;

       storeSummary = new Label("Store Summary:");
       storeSummary.relocate(37,20);
       storeSummary.setAlignment(Pos.CENTER);

       storeStock = new Label("Store Stock:");
       storeStock.relocate(250,20);
       storeStock.setAlignment(Pos.CENTER);

       currentCart = new Label();
       currentCart.relocate(540,20);
       currentCart.setAlignment(Pos.CENTER);

       sales = new Label("# Sales:");
       sales.relocate(27,45);

       revenue = new Label("Revenue:");
       revenue.relocate(20,73);

       perItemS = new Label("$ / Sale:");
       perItemS.relocate(24,103);

       popularItems = new Label("Most Popular Items:");
       popularItems.relocate(26,136);
       popularItems.setAlignment(Pos.CENTER_RIGHT);

       totalSales= new TextField();
       totalSales.relocate(70,40);
       totalSales.setPrefSize(80,20);
       totalSales.setText("0");

       revenueField = new TextField();
       revenueField.relocate(70,70);
       revenueField.setPrefSize(80,20);
       revenueField.setText("0.00");

       perItemField = new TextField();
       perItemField.relocate(70,100);
       perItemField.setPrefSize(80,20);

       popularItemsList = new ListView<>();
       popularItemsList.setPrefSize(140,141);
       popularItemsList.relocate(10,160);

       currentCartList = new ListView<>();
       currentCartList.relocate(440,40);
       currentCartList.setPrefSize(263,260);

       storeStockList = new ListView<>();
       storeStockList.relocate(160,40);
       storeStockList.setPrefSize(270,260);

       buttonPane = new ElectronicStoreButtonPane();
       buttonPane.relocate(0,310);

       getChildren().addAll(storeSummary,storeStock,currentCart,popularItems,sales,revenue,perItemS,
               totalSales,revenueField,perItemField,popularItemsList,currentCartList,
               storeStockList,buttonPane);
   }


   //I made this method to set the electronic store..i had some problems with the reset button. this method really helped
   public void setModel(ElectronicStore model) {
      this.model = model;
   }

   public void update() {
      storeStockList.setItems(FXCollections.observableArrayList(model.getProducts())); //To fill the store_stock with the products
      currentCartList.setItems(FXCollections.observableArrayList(model.getItemsInCart())); //To fill the current_cart with the items in the cart
      revenueField.setText(String.valueOf(model.getRevenue())); //getRevenue returns a double so we want to convert to a string
      totalSales.setText(String.valueOf(model.getNumSales())); //The total sales would hold the number of sales made. Method returns double so we want a string
      currentCart.setText("Current Cart ($" + model.totalOfCart() + ")"); //This sets the current_Cart label to the total items in the cart(it's zero when nothing is in the cart)
      popularItemsList.setItems(FXCollections.observableArrayList(model.mostPopularProducts())); //To set the most_popular products

      if(model.getNumSales() == 0){ //If no sale has been made, we want to set the text to N/A
         perItemField.setText("N/A");
      }else{
         double averageSales = (model.getRevenue() / model.getNumSales());
         perItemField.setText(String.valueOf(averageSales)); //We want a string rep
      }

      //If the listView is empty, disable the complete sale button, else enable it
      if(model.getItemsInCart().isEmpty()){
         buttonPane.getCompleteSale().setDisable(true);
      }else{
         buttonPane.getCompleteSale().setDisable(false);
      }

      //If nothing in the cart is selected, disable the remove button
      if(currentCartList.getSelectionModel().getSelectedIndex() == -1 ){
         buttonPane.getRemoveFromCart().setDisable(true);
      }else{
         buttonPane.getRemoveFromCart().setDisable(false);
      }
      //If nothing in the store stock is selected, disable the add button, else enable it
      if(storeStockList.getSelectionModel().getSelectedIndex() == -1 ){
         buttonPane.getAddToCart().setDisable(true);
      }else{
         buttonPane.getAddToCart().setDisable(false);
      }
   }

}

