package org.migue.learning.spring;

import java.util.List;

public class TriangleList {
    private List<Point> points;

    public void setPoints(List<Point> points){
        this.points=points;
    }
    public List<Point> getPoints(){
        return points;
    }

    public void draw(){
        for(Point p:points){
            System.out.println("Point = " + "(" + p.getX() + "," + p.getY() + ")");

        }
    }
}
