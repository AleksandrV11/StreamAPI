package StreamPractic;

import java.util.List;
import java.util.stream.Collectors;

public class TestExercise5 {
    public static void main(String[] args) {

        Exercise5 student = new Exercise5("Vasyn", 56);
        Exercise5 student1 = new Exercise5("Petro", 6);
        Exercise5 student2 = new Exercise5("Sancho", 5);
        Exercise5 student3 = new Exercise5("Valera", 19);

        List<Exercise5> studentList = List.of(student, student1, student2, student3);
        Double studentList1 = studentList.stream()
                .collect(Collectors.averagingDouble(s -> s.grade));


        System.out.println(studentList1);

    }


}

