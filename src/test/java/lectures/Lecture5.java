package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
    Predicate<Car> carPredicate = car -> car.getPrice() < 10000;
    List<Car> collect = cars.stream().filter(carPredicate).collect(Collectors.toList());
    System.out.println(collect.size());
  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();
    List<PersonDTO> collect = people.stream().map(person ->  new PersonDTO(person.getId(), person.getFirstName(), person.getAge())).collect(Collectors.toList());
    System.out.println(collect.size());
    List<PersonDTO> collect1 = people.stream().map(PersonDTO::map).collect(Collectors.toList());
    System.out.println(collect1.size());
  }

  @Test
  public void averageCarPrice() throws Exception {
     List<Car> cars = MockData.getCars();
   double average = cars.stream().mapToDouble(car -> car.getPrice()).average().orElse(0);
    OptionalDouble average1 = cars.stream().mapToDouble(car -> car.getPrice()).average();

    System.out.println(average);
    System.out.println(average1.getAsDouble());
  }

  @Test
  public void test() throws Exception {

  }
}



