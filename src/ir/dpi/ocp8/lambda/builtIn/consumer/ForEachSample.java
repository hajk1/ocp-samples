package ir.dpi.ocp8.lambda.builtIn.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class ForEachSample {

  public static void main(String[] args) {
    List<String> dogNames = Arrays.asList("boi", "clover", "zooey");
    Consumer<String> printName = name -> System.out.println(name);
    dogNames.forEach(printName);
  }

}
