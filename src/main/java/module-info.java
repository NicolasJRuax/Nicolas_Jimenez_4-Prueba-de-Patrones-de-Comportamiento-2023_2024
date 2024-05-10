module com.Examen_4TP.Clases {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    // Abre los paquetes a javafx.fxml donde es necesario para la inyección de dependencias y reflexión
    opens com.Examen_4TP.Clases to javafx.fxml;
    opens com.Examen_4TP.Clases.Tokens to javafx.fxml;
    opens com.Examen_4TP.Clases.Reverser to javafx.fxml;
    opens com.Examen_4TP.Clases.HaltChecker to javafx.fxml;
    opens com.Examen_4TP.Clases.HaltChecker.AnalisisDelLenguaje to javafx.fxml;

    // Exporta los paquetes para que sean visibles a otros módulos y al sistema de JavaFX
    exports com.Examen_4TP.Clases;
    exports com.Examen_4TP.Clases.HaltChecker;
    exports com.Examen_4TP.Clases.Reverser;
    exports com.Examen_4TP.Clases.Tokens;
    exports com.Examen_4TP.Clases.HaltChecker.AnalisisDelLenguaje;
}