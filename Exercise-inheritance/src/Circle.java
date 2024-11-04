public class Circle extends Shape{

    private double radius=1.0;
    //private double area;

    Circle(){

    }

    Circle(double radius){
      this.radius=radius;
    }



    Circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius=radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(double radius){
       return radius ;
    }

    public double getArea() {
        return radius*radius*3.14;

    }

    public double getPerimeter() {
        return 2 * radius*3.14;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();

    }
}
