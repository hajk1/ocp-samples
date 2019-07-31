package ir.dpi.ocp8.lambda.builtIn.supplier;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class SupplierSample3 {

  public static void main(String[] args) {
    Logger logger = Logger.getLogger("Status Logger");
    /* OFF,SEVERE,WARNING,INFO,CONFIG,FINE,FINER,FINEST */
    logger.setLevel(Level.SEVERE);
    String currentStatus = "Every thing's okay";
    logger.log(Level.INFO, currentStatus);
  }
}