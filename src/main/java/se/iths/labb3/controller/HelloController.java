package se.iths.labb3.controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class HelloController {
    public ChoiceBox forTheShape;
    public ChoiceBox forTheColor;
    public ChoiceBox forTheSize;
    public Button buttonToApply;
    public Canvas shapeHome;
    public Pane paneColor;


    public void initialize(){
        paneColor.setStyle("-fx-background-color: #C0C0C0;");



    }


    public void drawTheShape(MouseEvent mouseEvent) {

    }
}