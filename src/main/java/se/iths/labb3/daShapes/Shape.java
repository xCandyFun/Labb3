package se.iths.labb3.daShapes;

import javafx.css.Size;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import se.iths.labb3.controller.HelloController;
import se.iths.labb3.model.Model;
import se.iths.labb3.theBestEnums.enumShapes;
import se.iths.labb3.theBestEnums.enumSize;

public abstract class Shape {
    convertColorToHex goodToHaveColor = new convertColorToHex();
    private final double x;
    private final double y;
    private final double shapeSize;
    private Color shapeColor;

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

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public void drawShape(GraphicsContext context){

    }
    public abstract boolean isInSide(double x, double y );
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
            case RECTANGLE -> new Rectangle(x,y,shapeSize,color);
            case CIRCLE -> new Circle(x,y,shapeSize,color);
        };
    }

    public  String svg(){
        return "<circle cx=\"0\" cy=\"0\" r=\"0\" fill=\"#B3B31A\" />"+
                "<rect x=\"0\" y=\"0\" width=\"0\" height=\"0\" fill=\"#B3B31A\"/>";
    }
}
