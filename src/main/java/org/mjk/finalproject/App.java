package org.mjk.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class App extends Application {
    private static App instance;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("primary.fxml")), 600, 400);
        instance = this;
        Image appIcon = new Image(getClass().getResourceAsStream("/org/mjk/finalproject/mugPNG.png"));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Tea Timer");
        stage.getIcons().add(appIcon);
        stage.setScene(scene);
        stage.setMinWidth(600); // Minimum width
        stage.setMinHeight(400); // Minimum height
        stage.setMaxWidth(600); // Maximum width
        stage.setMaxHeight(400); // Maximum height 650
        stage.show();


    }

}
