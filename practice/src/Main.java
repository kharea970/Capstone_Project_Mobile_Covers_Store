import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main  {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stream<Integer> s1 = Stream.of(1,2,3,4);
//        s1.filter(n->n>2);
        List<Integer> d1 = s1.filter(n->n>2).collect(Collectors.toList());
        System.out.println(d1);
    }
}

