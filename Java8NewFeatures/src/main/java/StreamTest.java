import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args){

        //Given a list of integers, return the even numbers squared using streams.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evensquaredNum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        evensquaredNum.forEach(System.out::println);

        //Calculate the average age of people using streams.

        List<Integer> ages = Arrays.asList(25, 30, 35, 40, 45);
        double avg = ages.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average :" + avg);
    }
}
