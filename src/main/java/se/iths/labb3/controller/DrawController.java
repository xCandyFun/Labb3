package se.iths.labb3.controller;

import javafx.beans.binding.Bindings;
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

import java.io.File;


public class DrawController {
    public ChoiceBox<enumShapes> forTheShape;
    public ChoiceBox<enumSize> forTheSize;
    public Canvas drawOnCanvas;
    public Pane paneColor;
    public Button undoButton;
    public Button saveButton;
    public ColorPicker colorPicker;

    public GraphicsContext context;
    public VBox vBox;

    Model model = new Model();
    FileChooser fc = new FileChooser();

    public void initialize(){
        forTheShape.setItems(Model.shapeList);
        forTheSize.setItems(Model.sizeList);
        colorPicker.valueProperty().bindBidirectional(model.currentColorProperty());
        context = drawOnCanvas.getGraphicsContext2D();
        undoButton.disableProperty().bind(Bindings.equal(0, model.to.sizeProperty()));
        String homeFolder = System.getProperty("user.home");
        fc.setInitialDirectory(new File(homeFolder));
    }
    public void drawTheShape(MouseEvent mouseEvent) {
        if (mouseEvent.isControlDown()){
            for (Shape shape: model.to){
                if (shape.isInSide(mouseEvent.getX(), mouseEvent.getY())){
                    shape.setShapeColor(colorPicker.getValue());
                }
            }
        }else {
            Shape shape = Shape.createShape(forTheShape.getValue(),
                    mouseEvent.getX(), mouseEvent.getY(),
                    Shape.sizeOfTheShape(forTheSize.getValue()), colorPicker.getValue());
            model.to.add(shape);
        }
        redraw();
    }
    public void onUndoAction(ActionEvent actionEvent) {
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
        Window stage = vBox.getScene().getWindow();
        fc.setTitle("Save Dialog");
        fc.setInitialFileName("mysave");
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("SVG file", "*.SVG"));
        File file = fc.showSaveDialog(stage);
        if( file != null)
            model.saveToFile(file.toPath());
    }
}
