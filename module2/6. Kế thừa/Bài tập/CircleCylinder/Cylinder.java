package CircleCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double acreage() {
        return super.acreage();
    }

    public double volume() {
        return radius*radius*height*Math.PI;
    }

    public String toString(){
        return "Radius of cylinder: "
                +radius
                +"\n"
                +"Color: "
                +color
                +"\n"
                +"Height: "
                +height
                +"\n"
                +"Acreage: "
                +acreage()
                +"\n"
                +"Volume: "
                +volume();
    }
}
