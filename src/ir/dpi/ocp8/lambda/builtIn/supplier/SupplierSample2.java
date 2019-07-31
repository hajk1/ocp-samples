package ir.dpi.ocp8.lambda.builtIn.supplier;

import java.util.Map;
import java.util.function.Supplier;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class SupplierSample2 {

  public static void main(String[] args) {
    Supplier<String> userSupplier = () -> {
      Map<String, String> env = System.getenv();
      return env.get("USER");
    };
    System.out.println("User is  = " + userSupplier.get());

  }

}
