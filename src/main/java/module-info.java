module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.Examen_4TP.Main to javafx.fxml;
    exports com.Examen_4TP.Main;
}