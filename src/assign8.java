import java.util.Scanner;

class Shape{
    double area;
    Scanner sc = new Scanner(System.in);
//    public void setArea(){}
    public void getInputs(){}

    void setArea(int height, int length) {
        area = 0.5*height*length;
        System.out.println("Area of Triangle : " + area +"\n");
    }

    void setArea(double side) {
        area = side * side;
        System.out.println("Area of Triangle : " + area +"\n");
    }

    void setArea(float radius) {
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + area +"\n");
    }
}

class Triangle extends Shape{
    int height;
    int base;
    public void getInputs() {
        System.out.print("Enter the height of triangle : ");
        height = sc.nextInt();
        System.out.print("Enter the base of triangle : ");
        base = sc.nextInt();
    }
}

class Square extends Shape{
    double side;
    public void getInputs() {
        System.out.print("Enter the side of the square: ");
        side = sc.nextDouble();
    }
}

class Circle extends Shape{
    float radius;
    public void getInputs() {
        System.out.print("Enter the radius of circle : ");
        radius = sc.nextFloat();
    }
}

public class assign8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Triangle Dimensions: \n");
        Triangle t1 = new Triangle();
        t1.getInputs();
        t1.setArea(t1.height, t1.base);

        System.out.println("Enter Square Dimensions: \n");
        Square s1 = new Square();
        s1.getInputs();
        s1.setArea(s1.side);

        System.out.println("Enter Circle Dimensions: \n");
        Circle c1 = new Circle();
        c1.getInputs();
        c1.setArea(c1.radius);
    }
}