package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }
    System.out.println();
    IntStream.range(0,10).forEach(i -> System.out.println(i));
    IntStream.rangeClosed(0,10).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    IntStream.range(0,10).forEach(i-> System.out.println(people.get(i)));
    IntStream.range(0,people.size()).forEach(i-> System.out.println(people.get(i)));
    people.forEach(person -> System.out.println(person));
    people.stream().collect(Collectors.toList()).forEach(person -> System.out.println(person));
    people.stream().forEach(person -> System.out.println(person));

  }

  @Test
  public void intStreamIterate() throws Exception {
      IntStream.iterate(0, operand -> operand + 1)
          .filter(number -> number % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
      IntStream.rangeClosed(1,10)
              .filter(n-> n%2 != 0).forEach(System.out::println);
  }
}
