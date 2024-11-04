//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //shape

        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

        shape2.setColor("blue");
        shape2.setFilled(true);
        System.out.println(shape2);



        System.out.println("---------------------------------------------");

        //Circle

        Circle circle = new Circle("red", true, 5.0);
        System.out.println(circle);
        circle.setRadius(5);
        System.out.println("Area: "+circle.getArea());
        System.out.println("Perimeter: "+circle.getPerimeter());
        System.out.println("---------------------------------------------");

        //Rectangle

        Rectangle rect = new Rectangle("blue", true, 5, 10);
        System.out.println(rect);
        System.out.println("Area: "+rect.getArea());
        System.out.println("Perimeter: "+rect.getPerimeter());
        System.out.println("---------------------------------------------");

        //Square

        Square square = new Square("purple", true, 3.0);
        System.out.println(square);
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Perimeter of square: " + square.getPerimeter());






    }
}