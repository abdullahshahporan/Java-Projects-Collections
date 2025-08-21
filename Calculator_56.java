public class Calculator_56 {
    // Add method
    public float add(float a, float b) {
        return a + b;
    }

    // Subtract method
    public float subtract(double a, double b) {
        return a - b;
    }

    // Multiply method
    public float multiply(float a, float b) {
        return a * b;
    }

    // Divide method
    public float divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
