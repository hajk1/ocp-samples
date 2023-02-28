package ir.dpi.ocp8.thread.singleton;

import java.util.HashSet;
import java.util.Set;

public class Show {

  private static Show INSTANCE;
  private Set<String> availableSeats;

  public static synchronized Show getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Show();
    }
    return INSTANCE;
  }

  public Show() {
    availableSeats = new HashSet<>();
    availableSeats.add("A1");
    availableSeats.add("B1");
  }

  public synchronized boolean bookSeat(String seat){
    return availableSeats.remove(seat);
  }

}
