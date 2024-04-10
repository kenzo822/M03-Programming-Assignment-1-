public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    // Constructors and other methods from lines 2−47 in Listing 11.2 can be included here

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementing Comparable interface
    @Override
    public int compareTo(Circle otherCircle) {
        if (this.radius < otherCircle.radius) {
            return -1;
        } else if (this.radius > otherCircle.radius) {
            return 1;
        } else {
            return 0;
        }
    }

    // Implementing the getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Implementing the getArea() method
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle otherCircle = (Circle) obj;
        return Double.compare(otherCircle.radius, radius) == 0;
    }
}