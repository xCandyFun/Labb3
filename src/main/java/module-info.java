module se.iths.labb3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.labb3 to javafx.fxml;
    exports se.iths.labb3;
}