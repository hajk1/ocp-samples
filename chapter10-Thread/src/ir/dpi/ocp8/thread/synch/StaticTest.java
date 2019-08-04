package ir.dpi.ocp8.thread.synch;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class StaticTest {

  static int count;

  public static synchronized int getCount() {
    return count;
  }

//  public static int getCount(){
//    synchronized (StaticTest.class){
//      return count;
//    }
//  }
}
