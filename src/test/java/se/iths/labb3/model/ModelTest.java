package se.iths.labb3.model;

import javafx.beans.property.SimpleListProperty;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.iths.labb3.daShapes.Circle;
import se.iths.labb3.daShapes.Shape;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    Model model = new Model();

    @Test
    void IfInSideTheShape(){
        Circle circle = new Circle(100.0,100.0, 50.0, Color.BLUE);
        assertTrue(circle.isInSide(100.0,100.0));
    }
    @Test
    void IfNotInSideTheShape(){
        Circle circle = new Circle(100.0,100.0, 50.0, Color.BLUE);
        assertFalse(circle.isInSide(250.0,250.0));
    }
}