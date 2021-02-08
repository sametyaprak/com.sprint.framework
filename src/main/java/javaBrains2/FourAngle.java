package javaBrains2;

public class FourAngle implements Draw{

    private Point point;

    public FourAngle() {
    }

    public FourAngle(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


    @Override
    public void draw() {
        System.out.println(getPoint().getPointA());
        System.out.println(getPoint().getPointB());
        System.out.println(getPoint().getPointC());
        System.out.println(getPoint().getPointD());
        System.out.println("------------------------------");
        System.out.println("triangle uzunluk toplamı: " + getPoint().getPointA()
                +getPoint().getPointB()+getPoint().getPointC()+getPoint().getPointD());
    }
}
