package week3.assignment1.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtil {
    public static <T> Stream<T> listToStream(List<T> list) {
        return list.stream();
    }

    public static List<Integer> toListInteger(List<String> list) {
        return listToStream(list)
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> destructList(List<List<?>> arr) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            tmp.addAll((Collection<? extends Integer>) arr.get(i));
        }
        return tmp;
    }

    //        int max = modus.stream()
//                .mapToInt(l -> Integer.parseInt(l.get(1)))
//                .max()
//                .orElseThrow(IllegalArgumentException::new);

//    List<Integer> lessThanSix = set.stream()
//            .filter(l -> l < 6)
//            .collect(Collectors.toList());

//    public static int[] listStringToArrInt(List<String> list) {
//        return listToStream(list)
//                .mapToInt(Integer::parseInt)
//                .toArray();
//    }
}
