package ir.hajk1.ocp8.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperators {
    public static void main(String[] args) {
        testForEach();
        testMin();
        testAllMatch();
        testNonMatch();
        testAnyMatch();
        testCollect();
        testReduce();
        testFindFirst();
    }

    private static void testAnyMatch() {
        String[] names = {"Kayvan", "Kaveh", "Saeed"};
        System.out.println("any match?: " + Arrays.stream(names).
            anyMatch(s->s.startsWith("K")));

    }

    private static void testFindFirst() {
        String[] names = {"Kayvan", "Kaveh", "Saeed"};
        System.out.println("find first: " + Arrays.stream(names).
            filter(s->s.startsWith("K")).
            findFirst());

    }

    private static void testNonMatch() {
        String[] names = {"Kayvan", "Kaveh", "Saeed"};
        System.out.println("non match? " + Arrays.stream(names).noneMatch(a->a.length()==0));

    }

    private static void testReduce() {
        int[] ints = {1,2,3,4,5};
        int result = Arrays.stream(ints).reduce(0,(x,y)->x+y);
        System.out.println("result reduce= " + result);
        int result2 = Arrays.stream(ints).reduce(0,Integer::sum);
        System.out.println("result2 reduce= " + result2);
        OptionalInt result3 = Arrays.stream(ints).reduce(Integer::sum);
        if(result3.isPresent())
        System.out.println("result3 reduce= " + result3.getAsInt());
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
                .limit(50)
                .filter(n->n%5==0)
                .forEach(System.out::println);
    }
}
//    Optional<List<String>> optionalList. How do we find a value that starts with letter J in that list and print it. Everything in Stream API
//    optional.stream().flatmap(Optional:stream)
//    Lets imagine we have got Optional<Optional<Object>>. How do we simplify it to Optional<Object>
