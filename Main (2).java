public class Main {
    public static void main(String[] args) {
        // Test the Circle class
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        // Compare circles
        int result = circle1.compareTo(circle2);
        System.out.println("Comparison result: " + result);


        // Test equals method
        boolean areEqual = circle1.equals(circle2);
        System.out.println("Are circles equal? " + areEqual);
    }
}