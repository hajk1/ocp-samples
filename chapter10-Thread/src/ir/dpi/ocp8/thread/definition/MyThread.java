package ir.dpi.ocp8.thread.definition;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class MyThread extends Thread {

  @Override
  public void run() {
    System.out.println("Important Job done by thread");
  }

  public void run(String s) {
    System.out.println("String in run is : " + s);
  }


}
