package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18
    final int limit =10;
    int counter =0;
    for(Person pp : people){
      if (pp.getAge()<= 18){
        counter++;
        System.out.println(pp);
        if (counter == limit){
          break;
         }
     }
    }
    // 2. Then change implementation to find first 10 people

  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();
    people.stream().filter(person -> person.getAge()<=18).limit(10).collect(Collectors.toList()).forEach(System.out::println);
List<Person> younger = people.stream().filter(person -> person.getAge()<=18).limit(10).collect(Collectors.toList());
younger.forEach(System.out::println);
  }
}
