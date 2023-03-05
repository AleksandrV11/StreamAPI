package StreamPractic;

import java.util.List;
import java.util.stream.Collectors;

public class TestExercise3 {
    public static void main(String[] args) {


        Exercise3 tPerson = new Exercise3("Vasyn", 56);
        Exercise3 tPerson1 = new Exercise3("Petro", 6);
        Exercise3 tPerson2 = new Exercise3("Sancho", 5);
        Exercise3 tPerson3 = new Exercise3("Valera", 19);

        List<Exercise3> personList = List.of(tPerson, tPerson1, tPerson2, tPerson3);
        System.out.println(personList);
        List<Exercise3> personList1 = personList.stream()
                .filter(a -> a.age > 18).collect(Collectors.toList());
        System.out.println(personList1);

    }
}
