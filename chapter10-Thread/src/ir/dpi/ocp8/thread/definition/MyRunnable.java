package ir.dpi.ocp8.thread.definition;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class MyRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Important job is done in my Runnable");
  }
}
