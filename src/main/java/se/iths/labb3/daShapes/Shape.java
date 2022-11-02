package se.iths.labb3.daShapes;

import javafx.css.Size;
import javafx.scene.paint.Color;
import se.iths.labb3.controller.HelloController;
import se.iths.labb3.model.Model;
import se.iths.labb3.theBestEnums.enumShapes;
import se.iths.labb3.theBestEnums.enumSize;

public class Shape {
    private final double x;
    private final double y;
    private final double shapeSize;
    private final Color shapeColor;

    public Shape(double x, double y, double shapeSize, Color shapeColor) {
        this.x = x;
        this.y = y;
        this.shapeSize = shapeSize;
        this.shapeColor = shapeColor;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getShapeSize() {
        return shapeSize;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public static double sizeOfTheShape(enumSize size){
        if(size == enumSize.SMALL)
            return 50.0;
        if(size == enumSize.MEDIUM)
            return 100.0;
        if(size == enumSize.LARGE)
            return 150.0;
        return 0;
    }
    public static Shape createShape(enumShapes type, double x, double y, double shapeSize, Color color){
        return switch (type){
            case SQUARE -> new Rectangle(x,y,shapeSize,color);
            case CIRCLE -> new Circle(x,y, shapeSize, color);
        };
    }
}
