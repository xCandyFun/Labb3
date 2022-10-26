package se.iths.labb3.controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {
    public ChoiceBox forTheShape;
    public ChoiceBox forTheColor;
    public ChoiceBox forTheSize;
    public Button buttonToApply;
    public Canvas shapeHome;
    public Pane paneIsInTheBack;


    public void initialize(){
        paneIsInTheBack.setStyle("-fx-background-color: #C0C0C0;");



    }


    public void drawTheShape(MouseEvent mouseEvent) {

    }
}