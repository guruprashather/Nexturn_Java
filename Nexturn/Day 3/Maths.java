public class Maths {
    public static void main(String[] args) {
        int a = 10, b = 20; 

        // Basic Math Operations
        System.out.println("Absolute: " + Math.abs(-25.5));
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Square Root: " + Math.sqrt(16));
        System.out.println("Cube Root: " + Math.cbrt(27));
        System.out.println("Power: " + Math.pow(2, 3));

        // Rounding Methods
        System.out.println("Ceil: " + Math.ceil(4.3));
        System.out.println("Floor: " + Math.floor(4.9));
        System.out.println("Round: " + Math.round(4.5));
                                                        
        // Trigonometric Functions (Input in Radians)
        System.out.println("Sin: " + Math.sin(((90*Math.PI)/180)));
        System.out.println("Cos: " + Math.cos(((90*Math.PI)/180)));
        System.out.println("Tan: " + Math.tan(((90*Math.PI)/180)));
        System.out.println("Arcsin: " + Math.asin(0.5));
        System.out.println("Arccos: " + Math.acos(0.5));
        System.out.println("Arctan: " + Math.atan(1));

        // Logarithm and Exponential Functions
        System.out.println("Exp: " + Math.exp(2));
        System.out.println("Log (ln): " + Math.log(10));
        System.out.println("Log10: " + Math.log10(100));

        // Random Number Generation
        System.out.println("Random (0 to 1): " + Math.random());

        // Constants
        System.out.println("PI: " + Math.PI);
        System.out.println("Euler's Number (e): " + Math.E);
    }
}
