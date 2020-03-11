package com.task;

public class Triangle {
    private  double firstSide;
    private  double secondSide;
    private  double thirdSide;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    Triangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 2;
        this.y2 = 4;
        this.x3 = 4;
        this.y3 = 0;
        this.firstSide =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        this.secondSide = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        this.thirdSide = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

    }

    Triangle(double x1, double y1, double  x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.firstSide =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        this.secondSide = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        this.thirdSide = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
    }

    public void setFirstPoint(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setSecondPoint(double x2, double y2 ) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setThirdPoint(double x3 , double y3) {
        this.x3 = x3;
        this.y3 = y3;
    }

    public void setTriangle ()
    {
        this.firstSide =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        this.secondSide = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        this.thirdSide = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
    }

    public  double getPerimeterTriangle() {
        double perimeter;
        perimeter = firstSide + secondSide + thirdSide;
        return  perimeter;
    }

    public  double getSquareTriangle() {
        double  square;
        double halfPerimeter;
        halfPerimeter = getPerimeterTriangle() / 2 ;
        square = Math.sqrt( halfPerimeter * ( halfPerimeter - firstSide) * ( halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        return   square;
    }

    public double [] searchMedianIntersectionPoint() {
        double pointX = (x1 + x2+ + x3)/3;
        double pointY = ( y1 + y2 +y3) /3;
        double  points[] = new double[2];
        points[0] = pointX; points[1] = pointY;
        return  points;
    }
}
