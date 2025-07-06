import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTestClass {

    public static void main(String[] args){
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", 25));
        list.add(new Person("Jonny", 29));
        list.add(new Person("Janardhan", 21));
        list.add(new Person("Tara", 19));
        list.add(new Person("Deepa", 30));

        Collections.sort(list, (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));

        list.forEach(person -> System.out.println(person.getName() + " : " + person.getAge()));

        System.out.println("-------------------");

        PersonComparator personComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        list.sort(personComparator::compare);

        list.forEach(person -> System.out.println(person.getName() + " : " + person.getAge()));
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

@FunctionalInterface
interface PersonComparator{
    int compare(Person p1, Person p2);
}
