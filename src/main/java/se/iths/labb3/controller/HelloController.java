package se.iths.labb3.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import se.iths.labb3.theBestEnums.enumShapes;
import se.iths.labb3.theBestEnums.enumSize;

public class HelloController {
    public ChoiceBox<enumShapes> forTheShape;
    public ChoiceBox<enumSize> forTheSize;
    public Canvas drawOnCanvas;
    public GraphicsContext context;
    public Pane paneColor;
    public Button undoButton;
    public Button saveButton;
    public ColorPicker colorPicker;
    ObservableList<enumShapes> list = FXCollections.observableArrayList(enumShapes.values());

    public void initialize(){
        context = drawOnCanvas.getGraphicsContext2D();
        paneColor.setStyle("-fx-background-color: #C0C0C0;");
        ShapeOfThefigures();
    }


    public void ShapeOfThefigures(){
        forTheShape.setItems(list);
    }
    public void drawTheShape(MouseEvent mouseEvent) {
    }
//    public void setShapeSize(){
//        list.removeAll(list);
//        String small = "Small";
//        String medium = "Medium";
//        String large = "Large";
//        list.addAll(small, medium, large);
//        forTheSize.getItems().addAll(list);
//    }

    public void OnUndoAction(ActionEvent actionEvent) {
    }

    public void OnSaveAction(ActionEvent actionEvent) {
    }
}