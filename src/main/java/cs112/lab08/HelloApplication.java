package cs112.lab08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    //CONSTANTS

    //array of LoteriaCards to use for game:
    private static final LoteriaCard[] LOTERIA_CARDS = {
            new LoteriaCard("Las matematicas", "1.png", 1),
            new LoteriaCard("Las ciencias", "2.png", 2),
            new LoteriaCard("La Tecnología", "8.png", 8),
            new LoteriaCard("La ingeniería", "9.png", 9),
    };

    //CLASS-LEVEL VARIABLES
    //private Label messageLabel;
    //private ImageView cardImageView;
    //private Button drawCardButton;
    //private Label titleLabel;
    //private ProgressBar


    @Override
    public void start(Stage stage) throws IOException {
        //SETUP COMPONENTS
        Label titleLabel = new Label("Welcome to EChALE STEM Loteria!");
        ImageView cardImageView = new ImageView();
        Label messageLabel = new Label("Click the button to randomly draw a card. The progress bar will indicate how far we're into the game.");
        Button drawCardButton = new Button("Draw Random Card");
        //gameProgressBar = new ProgressBar();


        //ADD COMPONENTS
        VBox vbox = new VBox();
        vbox.getChildren().addAll(titleLabel, cardImageView,
                messageLabel, drawCardButton);

        //SETUP SCENE AND SHOW
        Scene scene = new Scene(vbox, 350, 500);
        stage.setScene(scene);
        stage.setTitle("EChALE STEM Loteria");
        stage.show();



        //SET COMPONENT PROPERTIES
        /*
        LoteriaCard tempCard = new LoteriaCard();
        cardImageView.setImage(tempCard.getImage());
        cardImageView.setFitWidth(300);
        cardImageView.setPreserveRatio(true);

        messageLabel.setWrapText(true);

        //SETUP LAYOUT

        */





    }

    @Override
    public void handle(ActionEvent actionEvent){

    }
    public static void main(String[] args) {
        launch();
    }
}







/*
package replit;

//IMPORTED PACKAGES




public class Main extends Application {
	//CONSTANTS
    private static final LoteriaCard[] LOTERIA_CARDS = {
            new LoteriaCard("Las matematicas", "1.png", 1),
            new LoteriaCard("Las ciencias", "2.png", 2),
            new LoteriaCard("La Tecnología", "8.png", 8),
            new LoteriaCard("La ingeniería", "9.png", 9),
    };



	//GUI METHODS
    public static void main(String[] args) {

        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {





        //SETUP SCENE AND SHOW



    }
}

 */