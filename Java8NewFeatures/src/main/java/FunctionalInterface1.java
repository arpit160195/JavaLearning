
public class FunctionalInterface1 {

    public static void main(String[] args){
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        };
        System.out.println(add.calculate(5, 3)); // Output: 8
        System.out.println(subtract.calculate(10, 4));
        System.out.println(multiply.calculate(7, 4));
        try{
            System.out.println(divide.calculate(30, 3));
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

@FunctionalInterface
interface Calculator{
    Integer calculate(Integer a, Integer b);
}
