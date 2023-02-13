package ir.hajk1.ocp8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperators {
    public static void main(String[] args) {
        testForEach();
        testMin();
        testAllMatch();
        testCollect();
        testReduce();
    }

    private static void testReduce() {
        int[] ints = {1,2,3,4,5};
        int result = Arrays.stream(ints).reduce(0,(x,y)->x+y);
        System.out.println("result = " + result);
    }

    private static void testCollect() {
        String[] names = {"Kayvan", "Kaveh", "Saeed"};
        List<String> k1List = Arrays.stream(names)
                .filter(s->s.length()==6)
                .collect(Collectors.toList());
        System.out.println("k1List = " + k1List);

    }

    private static void testAllMatch() {
        String[] names = {"Kayvan", "Kaveh", "Saeed"};
        System.out.println("all match? " + Arrays.stream(names).allMatch(a->a.length()>0));

    }

    private static void testMin() {
        Optional<Integer> opt = Stream.generate(()->8).limit(10).min(Integer::compareTo);
        System.out.println("opt.get() = " + opt.get());
    }

    private static void testForEach() {
        Stream.iterate(1, x->x+2)
                .limit(500)
                .filter(n->n%5==0)
                .forEach(System.out::println);
    }
}
