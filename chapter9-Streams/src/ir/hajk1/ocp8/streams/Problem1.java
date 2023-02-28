package ir.hajk1.ocp8.streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Problem1 {
  //LuxSoft interview question
  public static void main(String[] args) {
    Problem1 p = new Problem1();
    p.solve();
    p.solve2();
  }

  /**
   *
   Let's imagine we have got Optional<Optional<Object>>. How do we simplify it to Optional<Object>
   *
   */
  private void solve2() {
    Optional<Optional<String>> opt1 = Optional.of(Optional.of("Hello"));
    Optional<String> opt2 = opt1.orElseGet(()->Optional.empty());
    System.out.println("opt2.get() = " + opt2.get());
    Optional<Optional<String>> opt1_1 = Optional.empty();
    Optional<String> opt2_2 = opt1_1.orElseGet(()->Optional.ofNullable(null));
    System.out.println("opt2_2.get() = " + opt2_2.orElse(null));
    // optional.stream().flatmap(Optional:stream)
    Optional<String> opt3 = opt1_1.flatMap(o->o);
  }

  /**
   //    Optional<List<String>> optionalList. How do we find a value that starts with letter J in that list and print it. Everything in Stream API
   *
   */
  private void solve() {
    Optional<List<String>> optionalList = Optional.ofNullable(List.of("JJ", "jj"));
    optionalList.ifPresent(
        l -> l.stream().filter(s -> s.startsWith("J")).forEach(System.out::println));
    Optional<List<String>> optionalList2 = Optional.empty();

    optionalList2.ifPresent(
        l -> l.stream().filter(s -> s.startsWith("J")).forEach(System.out::println));
  }

}
