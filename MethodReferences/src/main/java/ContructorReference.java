import java.util.Arrays;
import java.util.List;

public class ContructorReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arpit", "Zack", "Mohan", "Eli");
        System.out.println("---------Using Constructor Reference-----------");
        List<Person> person = names.stream().map(Person::new).toList();
        person.forEach(Person::getName);
    }
}


class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }
}


