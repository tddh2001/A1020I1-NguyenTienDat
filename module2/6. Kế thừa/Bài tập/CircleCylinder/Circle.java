package CircleCylinder;

public class Circle {
    public double radius;
    public String color;

    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double acreage(){
        return radius * Math.PI;
    }
    public String toString(){
        return "Radius of circle: "
                +getRadius()
                +"\n"
                +"Color: "
                +getColor()
                +"\n"
                +"Acreage: "
                +acreage();
    }
}
