package exercise;

// BEGIN
class Segment {
    private Point endPoint;
    private Point beginPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.endPoint = endPoint;
        this.beginPoint = beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getMidPoint() {
        return new Point((getBeginPoint().getX() + getEndPoint().getX()) / 2, (getBeginPoint().getY() + getEndPoint().getY()) / 2);
    }
}
// END
