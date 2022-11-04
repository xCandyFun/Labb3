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
        undoButton.disableProperty().bind(Bindings.equal(0, model.to.sizeProperty()));
        //paneColor.setStyle("-fx-background-color: #C0C0C0;");
    }



    public void drawTheShape(MouseEvent mouseEvent) {
        Shape shape = Shape.createShape(forTheShape.getValue(),
                mouseEvent.getX(), mouseEvent.getY(),Shape.sizeOfTheShape(forTheSize.getValue()),colorPicker.getValue());
        model.to.add(shape);
        redraw();
    }



    public void OnUndoAction(ActionEvent actionEvent) {
        model.to.remove(model.to.size()-1);
        redraw();
    }

    private void redraw() {
        context.setFill(Color.WHITE);
        context.fillRect(0,0,drawOnCanvas.getWidth(),drawOnCanvas.getHeight());
        for (Shape shape1: model.to){
            shape1.drawShape(context);
        }
    }

    public void OnSaveAction(ActionEvent actionEvent) {
    }

    //todo save to svg
    //todo change color on shape when draw
    //todo make 2 tests

}