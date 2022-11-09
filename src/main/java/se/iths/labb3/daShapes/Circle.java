package se.iths.labb3.daShapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape{
    public Circle(double x, double y, double shapeSize, Color shapeColor) {
        super(x, y, shapeSize, shapeColor);

    }
    @Override
    public void drawShape(GraphicsContext context) {
        context.setFill(this.getShapeColor());
        context.fillOval(this.getX() - getShapeSize()/2,
                this.getY()- getShapeSize()/2, this.getShapeSize(), this.getShapeSize());
    }

    @Override
    public  String svg() {
        return "<circle cx=\""+getX()+"\" cy=\""+getY()+"\" r=\""+getShapeSize()/2+"\" " +
                "fill=\""+goodToHaveColor.toHexString(getShapeColor())+"\" />";

    }
}
