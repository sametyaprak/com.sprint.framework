package javaBrains2;

public class Triangle implements Draw{

    private Point point;

    public Triangle(Point point) {
        this.point = point;
    }

    public Triangle() {
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void draw(){
        System.out.println(getPoint().getPointA());
        System.out.println(getPoint().getPointB());
        System.out.println(getPoint().getPointC());
        System.out.println("------------------------------");
        System.out.println("triangle uzunluk toplamı: " + getPoint().getPointA()
                        +getPoint().getPointB()+getPoint().getPointC());
    }

}
