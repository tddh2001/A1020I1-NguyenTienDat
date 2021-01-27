package Point2DPoint3D;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    public Point3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr2 = new float[3];
        arr2[0] = x;
        arr2[1] = y;
        arr2[2] = z;
        return arr2;
    }

    @Override
    public String toString() {
        return x + ", " +y + ", " +z;
    }
}
