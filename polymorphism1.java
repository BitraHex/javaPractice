abstract class Shape{
    abstract double calculatePerimeter();
}
abstract class Triangle extends Shape{
    double s1,s2,s3;
    Triangle(double s1,double s2, double s3)

{
    this.s1=s1;
    this.s2=s2;
    this.s3=s3;
}}

class EquilateralTriangle extends Triangle{
    EquilateralTriangle(double s){
        super(s,s,s);
    }
    @Override
    double calculatePerimeter(){
        return 3*s1;
    }
}
class IsoscaelesTriangle extends Triangle{
    IsoscaelesTriangle extends Triangle(double es,double b){
        super(es,es,b);
    }
    @Override
    double calculatePerimeter(){
        return  2 * s1 + s3;
    }
}
class ScaleneTriangle extends Triangle {

    ScaleneTriangle(double s1, double s2, double s3) {
        super(s1, s2, s3);
    }

    @Override
    double calculatePerimeter() {
        return s1 + s2 + s3;
    }
}
public class Main {
    public static void main(String[] args) {
        EquilateralTriangle eq = new EquilateralTriangle(5);
        IsoscelesTriangle iso = new IsoscelesTriangle(5, 8);
        ScaleneTriangle sca = new ScaleneTriangle(3, 4, 5);

        System.out.println("Equilateral Triangle Perimeter: " + eq.calculatePerimeter());
        System.out.println("Isosceles Triangle Perimeter: " + iso.calculatePerimeter());
        System.out.println("Scalene Triangle Perimeter: " + sca.calculatePerimeter());
    }
}