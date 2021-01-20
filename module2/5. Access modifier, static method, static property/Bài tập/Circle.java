package AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    void display(){
        System.out.println("Hình tròn màu "+color+" có bán kính "+radius);
    }
}
