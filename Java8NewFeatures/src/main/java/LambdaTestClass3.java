
public class LambdaTestClass3 {

    public static void main(String[] args){
        TestInterface test = testMethod("ABC");
        test.printHello();
    }

    public static TestInterface testMethod(String name){
//        test = (() -> System.out.println("Hello" + name));
//        test.printHello();
        return () -> System.out.println("Hello" + name);
    }
}

@FunctionalInterface
interface TestInterface{
    void printHello();
}
