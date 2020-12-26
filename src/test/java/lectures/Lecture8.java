package lectures;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;

import beans.Person;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Lecture8 {

  @Test
  public void simpleGrouping() throws Exception {
    Map<String, List<Person>> collect = MockData.getPeople().stream().collect(Collectors.groupingBy(Person::getGender));
    System.out.println(collect);
    collect.forEach((gendre,person)->{
      System.out.println(gendre);
      person.forEach(System.out::println);
    });

  }

  @Test
  public void groupingAndCounting() throws Exception {
    ArrayList<String> names = Lists
        .newArrayList(
            "John",
            "John",
            "Mariam",
            "Alex",
            "Mohammado",
            "Mohammado",
            "Vincent",
            "Alex",
            "Alex"
        );
    Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    collect.forEach((name,count)->{
      System.out.println(name +" "+ count);
    });

  }

}