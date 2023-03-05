package StreamPractic;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> strings = List.of("Vasyn", "Petro", "y", "Sanyok", "Vasyn", "y");
        List<String> strings1 = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(strings1);
    }
}
