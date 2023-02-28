package ir.dpi.ocp8.thread.singleton;

public class TestShow {

  public static void main(String[] args) {
    TestShow threadTest = new TestShow();
    threadTest.go();
  }

  private void go() {
    for (int i = 0; i < 100; i++) {
      Thread t = new Thread(()->{
        ticketAgentsBook("A1");
        ticketAgentsBook("B1");
      });
      t.start();
    }
  }

  private void ticketAgentsBook(String seat) {
    Show show = Show.getInstance();
    boolean result = show.bookSeat(seat);
    System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() +",seat:"+seat+ ":"
    + result);
  }

}
