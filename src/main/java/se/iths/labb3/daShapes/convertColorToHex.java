package se.iths.labb3.daShapes;

import javafx.scene.paint.Color;

public class convertColorToHex {
    private String format(double val) {
        String in = Integer.toHexString((int) Math.round(val * 255));
        return in.length() == 1 ? "0" + in : in;
    }

    public String toHexString(Color value) {
        return "#" + (format(value.getRed()) + format(value.getGreen()) + format(value.getBlue()) +
                format(value.getOpacity()))
                .toUpperCase();
    }
}
