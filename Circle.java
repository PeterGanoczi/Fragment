package sk.itsovy.ganoczi.fragment;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calcCircleArea(){
        return Math.PI * (radius*radius);
    }

    public double calcCirclePerimeter(){
        return Math.PI * (2*radius);
    }


}
