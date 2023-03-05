package StreamPractic;

public class Exercise5 {
    String name;
    int grade;

    public Exercise5(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Exercise5() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
