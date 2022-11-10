package se.iths.labb3.daShapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{
    public Rectangle(double x, double y, double shapeSize, Color shapeColor) {
        super(x, y, shapeSize, shapeColor);
    }
    public void drawShape(GraphicsContext context) {
        context.setFill(this.getShapeColor());
        context.fillRect(this.getX()- getShapeSize()/2, this.getY()- getShapeSize()/2,
                this.getShapeSize(), this.getShapeSize());
    }
    @Override
    public boolean isInSide(double px, double py) {
        double rx= getX()-getShapeSize()/2;
        double ry= getY()-getShapeSize()/2;
        double rw = getShapeSize();
        double rh = getShapeSize();
        if (px >= rx &&
        px <= rx + rw &&
        py > ry &&
        py<=ry+rh){
            return true;
        }
        return false;
    }
    @Override
    public String svg() {
        return "<rect x=\""+getX()+"\" y=\""+getY()+"\" width=\""+ getShapeSize()+"\" " +
                "height=\""+getShapeSize()+"\" fill=\""+goodToHaveColor.toHexString(getShapeColor())+"\"/>";
    }
}
