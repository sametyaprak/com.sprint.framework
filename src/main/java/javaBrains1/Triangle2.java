package javaBrains1;

public class Triangle2 {
    private Point a;
    private Point b;
    private Point c;

    public Triangle2() {
    }

    public Triangle2(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void draw(){
        System.out.println("point a : " + getA().getX() + "  "+ getA().getY());
        System.out.println("point b : " + getB().getX() + "  " + getA().getY());
        System.out.println("point c : " + getC().getX() + "  " + getA().getY());
    }


}
