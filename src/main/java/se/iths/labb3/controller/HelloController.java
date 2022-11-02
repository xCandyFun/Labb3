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
import se.iths.labb3.daShapes.Shape;
import se.iths.labb3.model.Model;
import se.iths.labb3.theBestEnums.enumShapes;
import se.iths.labb3.theBestEnums.enumSize;


public class HelloController {
    public ChoiceBox<enumShapes> forTheShape;
    public ChoiceBox<enumSize> forTheSize;
    public Canvas drawOnCanvas;
    public Pane paneColor;
    public Button undoButton;
    public Button saveButton;
    public ColorPicker colorPicker;

    public GraphicsContext context;

    Model model = new Model();

    public void initialize(){
        forTheShape.setItems(Model.shapeList);
        forTheSize.setItems(Model.sizeList);
        colorPicker.valueProperty().bindBidirectional(model.currentColorProperty());
        context = drawOnCanvas.getGraphicsContext2D();
        paneColor.setStyle("-fx-background-color: #C0C0C0;");
    }



    public void drawTheShape(MouseEvent mouseEvent) {
        Shape shape = Shape.createShape(forTheShape.getValue(), Shape.sizeOfTheShape(forTheSize.getValue()),
                mouseEvent.getX()-(2.5), mouseEvent.getY()-(2.5),colorPicker.getValue());
        ObservableList<Shape> somethingShape = FXCollections.observableArrayList(shape);
    }



    public void OnUndoAction(ActionEvent actionEvent) {
    }

    public void OnSaveAction(ActionEvent actionEvent) {
    }

}