package se.iths.labb3.model;

import javafx.beans.property.SimpleListProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.iths.labb3.daShapes.Shape;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    Model model = new Model();

    @Test
    void checkingTheSimpleListProperty(){
        var expected = model.to;
        var actual = new SimpleListProperty<Shape>();
        assertEquals(expected,actual);
    }
    @Test
    void checkingIfShapesComingThrough(){
        var expected = Model.shapeList;
        var actual = Model.getShapeList();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void ifTheSizeIsFromAListAndThenUse(){
        var expected = Model.sizeList;
        var actual = Model.getSizeList();
        assertEquals(expected,actual);
    }

}