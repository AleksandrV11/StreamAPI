package StreamPractic;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {


        List<String> strings = List.of("Vasyn", "Petro", "Alex", "Mixa", "Anton");
        System.out.println(strings);

        List<String> strings1 = strings.stream()
                .filter(s -> s.startsWith("A")).
                collect(Collectors.toList());
        System.out.println(strings1);


    }

}
