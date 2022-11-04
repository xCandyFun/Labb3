package se.iths.labb3.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import se.iths.labb3.controller.HelloController;
import se.iths.labb3.daShapes.Shape;
import se.iths.labb3.theBestEnums.enumShapes;
import se.iths.labb3.theBestEnums.enumSize;

import java.io.File;

public class Model {
    public static ObservableList<enumShapes> shapeList = FXCollections.observableArrayList(enumShapes.values());
    public static ObservableList<enumSize> sizeList = FXCollections.observableArrayList(enumSize.values());
    public SimpleListProperty<Shape> to = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ObjectProperty<Color> currentColor = new SimpleObjectProperty<>();
    public static ObservableList<enumShapes> getShapeList() {
        return shapeList;
    }
    public static void setShapeList(ObservableList<enumShapes> shapeList) {
        Model.shapeList = shapeList;
    }
    public static ObservableList<enumSize> getSizeList() {
        return sizeList;
    }
    public static void setSizeList(ObservableList<enumSize> sizeList) {
        Model.sizeList = sizeList;
    }
    public Color getCurrentColor() {
        return currentColor.get();
    }
    public ObjectProperty<Color> currentColorProperty() {
        return currentColor;
    }
    public void setCurrentColor(Color currentColor) {
        this.currentColor.set(currentColor);
    }
    public void saveFile(File file){
    }
}
