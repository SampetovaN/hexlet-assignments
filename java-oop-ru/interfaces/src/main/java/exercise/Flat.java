package exercise;

// BEGIN
class Flat implements Home {
    double area;
    double balconyArea;
    double floor;

    public Flat(double area, double balconyArea, double floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return this.area + this.balconyArea;
    }

    public double compareTo(Home home) {
        return Math.signum(getArea() - home.getArea());
    }

    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + (int)floor + " этаже";
    }
}
// END
