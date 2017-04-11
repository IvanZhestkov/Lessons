package Informatics;

import java.util.Comparator;

/**
 * Created by User on 21.03.2017.
 */
public class StudentComparator implements Comparator<StudentComparable> {
    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        return -o1.compareTo(o2);
    }
}
