import java.util.*;

public class LambdaTestClass2 {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Arpit", "Zack", "Mohan", "Eli");

        System.out.println("---------Lambda natural order-----------");

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        names.forEach(s -> System.out.println(s));

        System.out.println("---------Lambda reverse order-----------");

        names.sort((s1, s2) -> s2.compareTo(s1));

        names.forEach(System.out::println);

        System.out.println("---------Lambda length order-----------");

        names.sort((s1, s2) -> Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length())));

        names.forEach(System.out::println);

        System.out.println("---------Comparator natural order-----------");

        names.sort(Comparator.naturalOrder());

        names.forEach(System.out::println);

        System.out.println("---------Comparator reverse order-----------");

        names.sort(Comparator.reverseOrder());

        names.forEach(System.out::println);

        System.out.println("---------Comparator length order-----------");

        names.sort(Comparator.comparingInt(String::length));

        names.forEach(System.out::println);

        System.out.println("---------Functional Interface & Lambda length order-----------");

        ListComparer listComparerLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        names.sort((s1, s2) -> listComparerLength.compare(s1, s2));

        names.forEach(System.out::println);

        System.out.println("---------Functional Interface & Lambda reverse order-----------");

        ListComparer listComparerReverseLex = (s1, s2) -> s2.compareTo(s1);

        names.sort((s1, s2) -> listComparerReverseLex.compare(s1, s2));

        names.forEach(System.out::println);

    }
}

@FunctionalInterface
interface ListComparer {
    int compare(String s1, String s2);
}
