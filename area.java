class Area {
    double findArea(double r) {
        return 3.14 * r * r;
    }
    double findArea(double l, double b) {
        return l * b;
    }
    double findArea(int a) {
        return a * a;
    }
}

public class AreaMain {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of Circle: " + a.findArea(5.5));
        System.out.println("Area of Rectangle: " + a.findArea(4.0, 6.0));
        System.out.println("Area of Square: " + a.findArea(5));
    }
}

output:
Area of Circle: 94.985
Area of Rectangle: 24.0
Area of Square: 25
