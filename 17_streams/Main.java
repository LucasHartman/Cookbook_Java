import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

/*
Stream
Streams is really usefull for collactions
Just ask what you want

Source: https://www.youtube.com/watch?v=Q93JsQ8vcwY
*/
public class Main {

    public static void main(String[] args) {

        // 2. Create List; input methed
        List<Person> people = getPeople();

        // 3. Imperative approach ---------------------------------------------
        // Find all females in people list
        List<Person> females = new ArrayList(); // Create empty list
        for (Person person : people) { // Iterate people list
            if (person.getGender().equals(Gender.FEMALE)) { // if FEMALE
                females.add(person); // add to females list
            }
        }

        // females.forEach(System.out::println);

        // 3. Declarative approach (Steams)

        // Filter
        // Type listName = list.stream().filter( list -> if list item equals FEMALE).add
        // to list
        List<Person> femalez = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        // femalez.forEach(System.out::println);

        // Sort
        // Sort list by age (reversed)
        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        // All match
        // Check if everyone in the list is older than 6
        boolean allMatch = people.stream().allMatch(person -> person.getAge() > 6);
        System.out.println("allMatch: " + allMatch); // true

        // Any match
        boolean anyMatch = people.stream().anyMatch(person -> person.getAge() > 119);
        System.out.println("anyMatch: " + anyMatch); // true

        // None match
        boolean noneMatch = people.stream().noneMatch(person -> person.getName().equals("Antonio"));

        System.out.println("noneMatch: " + noneMatch);

        // Max
        people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        // Min
        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });
    }

    // 1. Method: Return list of people
    private static List<Person> getPeople() {
        return List.of(new Person("Jame Bond", 20, Gender.MALE), new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE), new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE), new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE));
    }

}