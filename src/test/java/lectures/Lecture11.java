package lectures;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    String nameStr ="";
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
       for (String name : names){
     nameStr += name+", ";
       }

    System.out.println(nameStr.substring(0,nameStr.length()-2));
  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String collect = names.stream().collect(Collectors.joining(" "));
    System.out.println(collect);
  }
}
