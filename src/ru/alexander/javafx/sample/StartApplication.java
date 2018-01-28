package ru.alexander.javafx.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        
        stage.setMinHeight(600);
        stage.setMinWidth(400);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        testData();
    }
    
    private void testData() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

