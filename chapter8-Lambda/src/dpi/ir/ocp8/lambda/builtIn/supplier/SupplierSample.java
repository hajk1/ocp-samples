package dpi.ir.ocp8.lambda.builtIn.supplier;

import java.util.function.Supplier;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class SupplierSample {

  public static void main(String[] args) {
    Supplier<Integer> answerSupplier = () -> 42;

    Supplier<Integer> answerSupplierOld = new Supplier<Integer>() {
      @Override
      public Integer get() {
        return 42;
      }
    };
    System.out.println("answerSupplier.get() = " + answerSupplier.get());
    System.out.println("answerSupplierOld.get() = " + answerSupplierOld.get());

  }

}
