package StreamPractic;

public class Exercise3 {
    String name;
    int age;

    public Exercise3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Exercise3() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}