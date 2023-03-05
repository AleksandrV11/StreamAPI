package StreamPractic;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(2, 3, 5, 6, 7, 8, 9, 4, 5, 7, 6, 4 - 5, -4, 3, 88, 0);

        List<Integer> integerList1 = integerList.stream()
                .map(a -> a * 2)
                .collect(Collectors.toList());

        System.out.println(integerList);
        System.out.println("------------------");
        System.out.println(integerList1);
    }
}