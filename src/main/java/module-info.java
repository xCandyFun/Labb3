module se.iths.labb3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens se.iths.labb3 to javafx.fxml;
    exports se.iths.labb3;
    exports se.iths.labb3.controller;
    opens se.iths.labb3.controller to javafx.fxml;
    exports se.iths.labb3.theBestEnums;
    opens se.iths.labb3.theBestEnums to javafx.fxml;
}