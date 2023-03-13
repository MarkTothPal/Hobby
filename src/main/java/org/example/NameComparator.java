package org.example;

import java.util.Comparator;

/**
 *This class objective is to sort the objects in the Person class in ascending order by the name parameter.
 * @author Mark
 * */

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (o1.name).compareTo(o2.name);
    }
}
