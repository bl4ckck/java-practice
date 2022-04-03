package week3.assignment1.helper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtil {
    public static <T> Stream<T> listToStream(List<T> list) {
        return list.stream();
    }

//    public static int[] listStringToArrInt(List<String> list) {
//        return listToStream(list)
//                .mapToInt(Integer::parseInt)
//                .toArray();
//    }

    public static List<Integer> toListInteger(List<String> list) {
        return listToStream(list)
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
}
