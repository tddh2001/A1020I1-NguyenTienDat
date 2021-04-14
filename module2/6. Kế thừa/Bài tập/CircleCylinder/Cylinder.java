package CircleCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
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
