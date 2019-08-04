package ir.dpi.ocp8.thread.synch;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class AccountDanger implements Runnable {

  private Account acc = new Account();

  public static void main(String[] args) {

    AccountDanger accountDanger = new AccountDanger();
    Thread one = new Thread(accountDanger, "one");
    Thread two = new Thread(accountDanger, "two");
    one.start();
    two.start();
  }


  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      makeWithrawal(10);
      if (acc.getBalance() < 0) {
        System.out.println("account is overdrawn!");
      }
    }
  }

  private void makeWithrawal(int amount) {
    if (acc.getBalance() >= amount) {
      System.out.println(Thread.currentThread().getName() + " is going to withdraw");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      acc.withdraw(amount);
      System.out.println(Thread.currentThread().getName() + " completes withdrawal");
    } else {
      System.out.println("Not enough money : " + Thread.currentThread().getName());
    }
  }
}

