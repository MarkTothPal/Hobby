package org.example;

import java.util.Comparator;

/**
 * This class objective is to sort the objects in the Person class in ascending order by the age parameter.
 * @author Mark
 */

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person e1, Person e2) {
        return Integer.compare (e1.age, e2.age);
    }
}
