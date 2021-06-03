package random_stream_API;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomShuffle {
    public static void main(String[]args){
        List<Integer> list = IntStream.range(1,20).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        list.forEach(System.out::println);

        IntStream.iterate(1, x -> x*2).limit(10).sorted().forEach(System.out::println);
    }
}
