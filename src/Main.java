

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.stage.Stage;

import javafx.scene.Scene;

    public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("chat.fxml"));
            primaryStage.setTitle("Chat ");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.centerOnScreen();
            primaryStage.setResizable(false);
            primaryStage.show();
        }

    }

