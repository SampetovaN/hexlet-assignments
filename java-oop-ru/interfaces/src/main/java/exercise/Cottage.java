package exercise;

// BEGIN
class Cottage implements Home {
    double area;
    double floorCount;

    public Cottage(double area, double floorCount ) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public double compareTo(Home home) {
        return Math.signum(getArea() - home.getArea());
    }

    @Override
    public String toString() {
        return (int)floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
