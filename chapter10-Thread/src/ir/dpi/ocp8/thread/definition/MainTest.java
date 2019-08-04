package ir.dpi.ocp8.thread.definition;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class MainTest {

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();

    Runnable runnable = new MyRunnable();
    new Thread(runnable).start();

    Runnable r = () -> System.out.println("This job is running by Lambda.");

    Thread foo = new Thread(r);
    Thread bar = new Thread(r);
    Thread bat = new Thread(r);
    foo.start();
    foo.run();//Legal, but does not start a new thread
//    foo.start(); Thread can not be restarted more than once
    bar.start();
    bat.start();
  }

}
