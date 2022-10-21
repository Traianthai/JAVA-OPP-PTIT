package a;



class Triangle {
    private Point a,b,c;
    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public boolean valid() {
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        return (ab + ac > bc && ab + bc > ac && ac + bc > ab);
    }

    public String getPerimeter() {
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double cv = ab + ac + bc;
        return String.format("%.3f", cv);
    }
    
}