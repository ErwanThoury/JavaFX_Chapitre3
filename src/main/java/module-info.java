module com.example.chapitrestaticsurcharge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapitrestaticsurcharge to javafx.fxml;
    exports com.example.chapitrestaticsurcharge;
}