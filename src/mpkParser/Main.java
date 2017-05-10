package mpkParser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("mpkScheduleParser");
        Scene scene = new Scene(new VBox(), 1000, 800);
        window.setScene(scene);
        window.show();
        //window.setFullScreen(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}


// Parent root = FXMLLoader.load(getClass().getResource("/mpkParser/fxml/main.fxml"));