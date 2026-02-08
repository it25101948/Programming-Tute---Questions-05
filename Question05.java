class Calculator {

    
    int sum(int a, int b) {
        return a + b;
    }

    
    int multiply(int a, int b) {
        return a * b;
    }

    
    int square(int a) {
        return a * a;
    }
}

public class Question05 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.sum(part1, part2);
        int result1 = calc.square(sum1);

        
        int sumA = calc.sum(4, 7);
        int squareA = calc.square(sumA);

        int sumB = calc.sum(8, 3);
        int squareB = calc.square(sumB);

        int result2 = calc.sum(squareA, squareB);

        
        System.out.println(result1);
        System.out.println(result2);
    }
}