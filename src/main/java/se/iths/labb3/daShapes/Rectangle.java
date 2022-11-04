package se.iths.labb3.daShapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{

    public Rectangle(double x, double y, double shapeSize, Color shapeColor) {
        super(x, y, shapeSize, shapeColor);
    }

    public void drawShape(GraphicsContext context) {
        context.setFill(this.getShapeColor());
        context.fillRect(this.getX()- getShapeSize()/2, this.getY()- getShapeSize()/2, this.getShapeSize(), this.getShapeSize());
    }
}
