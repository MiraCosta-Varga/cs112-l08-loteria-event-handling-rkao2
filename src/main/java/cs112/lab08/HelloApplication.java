package cs112.lab08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import javafx.scene.image.logo;

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

    ImageView cardImageView;
    Label messageLabel;

    //CLASS-LEVEL VARIABLES
    //private ImageView cardImageView;
    //private Button drawCardButton;
    //private Label titleLabel;
    //private ProgressBar


    @Override
    public void start(Stage stage) throws IOException {
        LoteriaCard cardLogo = new LoteriaCard();

        //SETUP COMPONENTS
        Label titleLabel = new Label("Welcome to EChALE STEM Loteria!");
        cardImageView = new ImageView( cardLogo.getImage());
        messageLabel = new Label("Click the button to randomly draw a card. The progress bar will indicate how far we're into the game.");
        Button drawCardButton = new Button("Draw Random Card");
        //gameProgressBar = new ProgressBar();


        //CUSTOMIZE COMPONENT
        cardImageView.setFitWidth(300);
        cardImageView.setPreserveRatio(true);
        titleLabel.setFont(new Font(20.0));
        drawCardButton.setOnAction(this);

        //ADD COMPONENTS
        VBox vbox = new VBox();
        vbox.getChildren().addAll(titleLabel, cardImageView,
                messageLabel, drawCardButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10.0);

        //SETUP SCENE AND SHOW
        Scene scene = new Scene(vbox, 350, 500);
        stage.setScene(scene);
        stage.setTitle("EChALE STEM Loteria");
        stage.show();

    }

    @Override
    public void handle(ActionEvent actionEvent){
        //handles button class
        System.out.println("Button was clicked");
        // get random card
        int randomInt = (int) (Math.random() * LOTERIA_CARDS.length); //gen 0-3
        LoteriaCard randomCard = LOTERIA_CARDS[randomInt];
        // image changes to card name
        cardImageView.setImage( randomCard.getImage() );

        //message label
        messageLabel.setText( randomCard.getCardName() );
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