package app;

import javafx.application.Application;
import javafx.stage.Stage;
import app.ui.MainUI;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        new MainUI().start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}