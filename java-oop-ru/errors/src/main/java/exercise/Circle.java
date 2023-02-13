package exercise;

// BEGIN
class Circle {
    Point point;
    int radius;

    public int getRadius() {
        return this.radius;
    }

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if(this.radius < 0) {
            throw new NegativeRadiusException("");
        }
        return Math.PI * Math.pow(this.radius, 2);
    }

}

// END
