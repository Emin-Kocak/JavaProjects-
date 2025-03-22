package recursive_factorial;

public class Recursive_factorial {

    public static void main(String[] args) {
        try {
            System.out.println("Factorial: " + recFac(8));
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    public static int recFac(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial of negative numbers cannot be calculated!");
        }
        
        if (num == 0 || num == 1) {
            return 1;

        }

        int sum = num * recFac(num - 1);
        return sum;

    }
}
