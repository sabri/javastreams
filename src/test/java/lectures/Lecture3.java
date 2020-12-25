package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class Lecture3 {

  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer min = numbers.stream().min((i,j)-> i.compareTo(j) ).get();
    Integer min1 = numbers.stream().min((i,j)-> i > j?1:-1 ).get();
    Integer min2= numbers.stream().min(Comparator.naturalOrder()).get();
    System.out.println(min2);
    System.out.println(min);
    System.out.println(min1);
    assertThat(min).isEqualTo(1);
  }

  @Test
  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
     Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
     Integer max1 = numbers.stream().max((i,j)-> i.compareTo(j)).get();
     Integer max2 = numbers.stream().max((i,j)-> i>j?1:-1).get();
    System.out.println(max);
    System.out.println(max1);
    System.out.println(max2);
    assertThat(max).isEqualTo(100);

  }
}
