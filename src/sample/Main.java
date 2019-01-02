package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        //Инициализация значений
        Team team1 = new Team();
        team1.name = "Барсук";
        team1.addTrainer();

        //Вывод значений
        System.out.print("Название команды: ");
        System.out.println(team1.name);
        System.out.println(team1.trainer.name);

        launch(args);
    }
}
