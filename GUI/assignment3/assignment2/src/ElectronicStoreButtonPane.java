import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
public class ElectronicStoreButtonPane extends Pane {
    private Button resetStore, addToCart, removeFromCart, completeSale;

    public ElectronicStoreButtonPane(){
        /** A documentation of the Button Pane class */
        /*Creates an inner pane */
        Pane innerPane = new Pane();
        resetStore = new Button("Reset Store");
        /*Position of the button  x and y axis */
        resetStore.relocate(20,0);
        /*Size of the button */
        resetStore.setPrefSize(119,39);
        resetStore.setAlignment(Pos.CENTER);

        addToCart = new Button("Add to Cart");
        addToCart.relocate(230,0);
        addToCart.setPrefSize(129,39);
        addToCart.setAlignment(Pos.CENTER);


        removeFromCart = new Button("Remove from Cart");
        removeFromCart.relocate(440,0);
        removeFromCart.setPrefSize(129,39);
        removeFromCart.setAlignment(Pos.CENTER);


        completeSale = new Button("Complete Sale");
        completeSale.relocate(576,0);
        completeSale.setPrefSize(129,39);
        completeSale.setAlignment(Pos.CENTER);

        /*Set the size of the pane */
        innerPane.setPrefSize(720,40);

        /*Add the features to the inner pane */
        innerPane.getChildren().addAll(removeFromCart,resetStore,addToCart,completeSale);
        /*Add inner pane to the window */
        getChildren().add(innerPane);

    }

    public Button getResetStore(){
        return resetStore;
    }

    public Button getAddToCart() {
        return addToCart;
    }

    public Button getRemoveFromCart() {
        return removeFromCart;
    }

    public Button getCompleteSale() {
        return completeSale;
    }
}







/*
Lessons learned: Always add colour to your buttons or anything to see where the problems at*/
