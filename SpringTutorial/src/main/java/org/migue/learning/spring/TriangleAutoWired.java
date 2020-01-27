package org.migue.learning.spring;

public class TriangleAutoWired {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public TriangleAutoWired(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void draw() {
        System.out.println("Point A = " + "(" + pointA.getX() + "," + pointA.getY() + ")");
        System.out.println("Point B = " + "(" + pointB.getX() + "," + pointB.getY() + ")");
        System.out.println("Point C = " + "(" + pointC.getX() + "," + pointC.getY() + ")");
    }
}
