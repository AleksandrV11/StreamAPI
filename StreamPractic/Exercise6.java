package StreamPractic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

        List<String> strings = List.of("vasyn", "a", "s", "petro", "p", "o");

        Exercise6 exercise6 = new Exercise6();
        List<Character> characters1 = strings.stream()
                .map(a -> a.toCharArray())
                .map(exercise6::arrayToList)
                .flatMap(a -> a.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(characters1);

    }

    private List<Character> arrayToList(char[] f) {
        List<Character> characters = new ArrayList<>();
        for (Character d : f) {
            characters.add(d);
        }
        return characters;
    }
}
