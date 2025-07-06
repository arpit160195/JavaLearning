
public class LambdaTestClass4 {

    public static void main(String[] args){
        PrintName p = (name) -> System.out.println("Hello" + name);
        testMethod("Demo", p);
    }

    public static void testMethod(String name, PrintName p){
        p.printHello(name);
    }
}

@FunctionalInterface
interface PrintName{
    void printHello(String name);
}
