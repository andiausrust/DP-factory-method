package com.andi;

class Point {
    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructor overloading (same type/number of arguments
    // is not allowed in java
    // public Point(double rho, double theta){
        // x = rho * Math.cos(theta);
        //y = rho * Math.sin(theta);
    // }

    public static class Factory {
        public static Point newCartesianPoint(double x, double y){
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Point point = Point.Factory.newCartesianPoint(3,4);

    }
}
