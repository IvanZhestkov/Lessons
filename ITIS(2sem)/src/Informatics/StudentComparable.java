package Informatics;

/**
 * Created by User on 21.03.2017.
 */
public class StudentComparable implements Comparable<StudentComparable> {

    private String name;
    private int age;

    public StudentComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentComparable o) {
        int result = name.compareTo(o.name);
        if (result == 0 && age != o.age) {
            result = (age - o.age) / Math.abs(age - o.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
