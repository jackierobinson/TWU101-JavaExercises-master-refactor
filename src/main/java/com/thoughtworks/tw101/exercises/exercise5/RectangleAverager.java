package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float sum=0;
        for (Rectangle rectangle : rectangles) {
            sum+=(float)rectangle.area();
        }
        float numberOfRectangles = (float)rectangles.length;
        return sum/numberOfRectangles;
    }
}
