package a;
public class Point3D {

    private int x;
    private int y;
    private int z;

    public Point3D(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Point3D vecor(Point3D a) {
        Point3D v = new Point3D(x * a.getZ() - a.getX() * z,
                z * a.getX() - a.getZ() * x, x * a.getY() - a.getX() * y);
        return v;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int p1_x = p1.getX(), p1_y = p1.getY(), p1_z = p1.getZ();
        int p2_x = p2.getX(), p2_y = p2.getY(), p2_z = p2.getZ();
        int p3_x = p3.getX(), p3_y = p3.getY(), p3_z = p3.getZ();
        int p4_x = p4.getX(), p4_y = p4.getY(), p4_z = p4.getZ();

        Point3D v1 = new Point3D(p2_x - p1_x, p2_y - p1_y, p2_z - p1_z);
        Point3D v2 = new Point3D(p3_x - p1_x, p3_y - p1_y, p3_z - p1_z);
        Point3D v3 = new Point3D(p4_x - p4_x, p4_y - p1_y, p4_z - p1_z);
        Point3D v4 = v1.vecor(v2);
        return (v3.getX() * v4.getX() + v3.getY() * v4.getY() + v3.getZ() * v4.getZ() == 0);
    }

}