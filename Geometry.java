
public class Geometry {

    // Area of Rectangle
    float areaOfRectangle(float L, float B) {
        return L * B;
    }

    // Static method: Volume of Cylinder
    static float volumeOfCylinder(float r, float h) {
        return (22f / 7f) * r * r * h;
    }

    // Area of Circle
    float areaOfCircle(float r) {
        return (22f / 7f) * r * r;
    }

    // Main method
    public static void main(String[] args) {

        Geometry geo = new Geometry();

        System.out.print("Area of Rectangle: "
                + geo.areaOfRectangle(3.5f, 2f));

        System.out.print("Area of Circle: "
                + geo.areaOfCircle(2f));

        System.out.print("Volume of Cylinder: "
                + Geometry.volumeOfCylinder(3f, 3f));

    }

}

