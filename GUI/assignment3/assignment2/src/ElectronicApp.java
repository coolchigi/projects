import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.event.*;

public class ElectronicApp extends Application{
    private ElectronicStore model;
    ElectronicStoreAppView view;

    public void start(Stage primaryStage) {
        model = ElectronicStore.createStore();
        view = new ElectronicStoreAppView(model);

        view.getStoreStockList().setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                view.update();
            }
        });

        view.getCurrentCart().setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                view.update();
            }
        });

        view.getButtonPane().getResetStore().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                model = ElectronicStore.createStore();
                view.setModel(model);
                view.update();
            }
        });

        view.getButtonPane().getRemoveFromCart().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleRemove();
                view.update();
            }
        });

        view.getButtonPane().getAddToCart().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleADD();
                view.update();
            }
        });

        view.getButtonPane().getCompleteSale().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                completeSale();
                view.update();
            }
        });

        primaryStage.setTitle("Electronic Store Application - " + model.getName());
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(view,720,360));
        primaryStage.show();
        view.update();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void handleADD(){
        //Basic functionality: When you add to the cart, you want to reduce the qty in stock by the amount added
      Product p = view.getStoreStockList().getSelectionModel().getSelectedItem();
      model.getItemsInCart().add(p);
      p.decreaseStockQuantity();
      view.update();
    }

    public void handleRemove(){
        /*Basic functionality: When you remove from the cart, you want to increase the stock quantity by the amount removed */
        int product = view.getCurrentCart().getSelectionModel().getSelectedIndex();
        model.removeFromCart(product);
        view.update();
    }

    public void completeSale(){
       /*Basic functionality: When you complete a sale, you want to
        Sell items in the cart.
        Clear the listview to avoid double counting which over_states revenue and update*/
        model.sellItemsInCart();
        model.getItemsInCart().clear();
        view.update();


    }



    }




