package ir.hajk1.ocp8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Generators {
    public static void main(String[] args) {
     String[] names = {"Kayvan", "Kaveh", "Saeed"};
        List<String> namelist = Arrays.asList(names);

        //create stream based on arrays
        Stream<String> arrayStream = Arrays.stream(names);

        //create stream based on collection
        Stream<String> listStream = namelist.stream();

        //create stream based on generate method
        Stream<Integer> generateStream = Stream.generate(()->8);

        //create stream based on iterate method
        Stream<Integer> iterateStream = Stream.iterate(1,x->x+2)
                .limit(500)
                .filter(n->n%5==0);
        iterateStream.forEach(System.out::println);

    }
}