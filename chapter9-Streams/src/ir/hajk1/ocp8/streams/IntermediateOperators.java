package ir.hajk1.ocp8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntermediateOperators {
    String[] names = {"Kayvan", "Kaveh", "Saeed"};
    public static void main(String[] args) {
        IntermediateOperators operators = new IntermediateOperators();
        operators.testFilter();
        operators.testMap();
        operators.testFlatMap();
        operators.testPeek();
        operators.testLimit();
        operators.testSkip();
        operators.testDistinct();
        operators.testSorted();
    }

    private void testSorted() {
        Arrays.stream(names)
                .sorted()
                .forEach(System.out::println);
    }

    private void testDistinct() {
        String[][] names2d = {names,names};
        System.out.println(Stream.of(names2d)
                .flatMap(array->Stream.of(array))
                .distinct()
                .count());
    }

    private void testSkip() {
        Arrays.stream(names)
                .skip(2)
                .forEach(System.out::println);
    }

    private void testLimit() {
        Arrays.stream(names)
                .limit(2)
                .forEach(System.out::println);
    }

    private void testPeek() {
        String[][] names2d = {names,names};
        Stream.of(names2d)
                .flatMap(array->Stream.of(array))
                .peek(s-> System.out.println("peek = " + s))
                .toArray(size->new String[size]);

    }

    private void testFlatMap() {
        String[][] names2d = {names,names};
        String[] names1D = Stream.of(names2d)
                .flatMap(array->Stream.of(array))
                .toArray(size->new String[size]);
        Stream.of(names1D)
                .forEach(System.out::println);
    }

    private void testMap() {
        Arrays.stream(names)
                .map(s->s+ " Tehrani")
                .forEach(System.out::println);
    }

    private void testFilter() {
        Arrays.stream(names)
                .filter(s->s.startsWith("S"))
                .forEach(System.out::println);
    }
}
