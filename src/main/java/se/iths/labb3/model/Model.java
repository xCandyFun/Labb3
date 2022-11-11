package se.iths.labb3.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import se.iths.labb3.daShapes.Shape;
import se.iths.labb3.theBestEnums.enumShapes;
import se.iths.labb3.theBestEnums.enumSize;

import java.nio.file.Files;
import java.nio.file.Path;

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
    public void saveToFile(Path file) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
        sb.append("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n");
        sb.append("<svg width=\"560\" height=\"324\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n");
        for (Shape shape: to)
            sb.append(shape.svg());
        sb.append("</svg>");
        try {
            Files.writeString(file, sb.toString());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
