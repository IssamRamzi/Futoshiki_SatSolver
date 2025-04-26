module com.mmsi.futoshiki {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mmsi.futoshiki to javafx.fxml;
    exports com.mmsi.futoshiki;
}