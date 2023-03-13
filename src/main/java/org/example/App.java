package org.example;

import java.util.*;

/**
 * The main focus of this class is the manipulation of the TreeSet with Person class and does the following:
 * 1. Sorts the list in ascending order by the name.
 * 2. Sorts the list in ascending order by the age.
 * 3. Links the TreeSet<Person> and List<Hobby> in a Hashmap and prints the Person and its Hobbies.
 * @author Mark
 */
public class App {
    public static void main(String[] args) {

        Person mark = new Person("Mark", 23);
        Person andrei = new Person("Andrei", 24);

        /* Sorting by name comparator */

        System.out.println("Sorting by Name");
        TreeSet<Person> personName = new TreeSet<>(new NameComparator());

        personName.add(mark);
        personName.add(andrei);

        Iterator<Person> iterator = personName.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + ", ");
        }

        /* Sorting by age comparator */

        System.out.println("Sorting by Age");
        TreeSet<Person> personAge = new TreeSet<>(new AgeComparator());

        personAge.add(mark);
        personAge.add(andrei);

        for (Person person2 : personAge) {
            System.out.println(person2);

        }

        //Address List elements


        Address romaniaAddress = new Address("Romania");
        Address hungaryAddress = new Address("Hungary");
        Address bulgaraiAddress = new Address("Bulgaria");

        List<Address> placesForHiking = new ArrayList<>();

        placesForHiking.add(romaniaAddress);
        placesForHiking.add(hungaryAddress);

        List<Address> placesForSkiing = new ArrayList<>();

        placesForSkiing.add(romaniaAddress);
        placesForSkiing.add(bulgaraiAddress);
        //Hobby List elements

        Hobby hiking = new Hobby("Hiking",1,placesForHiking);
        Hobby skiing = new Hobby("Skiing", 5,placesForSkiing);

        List<Hobby> markHobbies = new ArrayList<>();

        markHobbies.add(hiking);
        markHobbies.add(skiing);

        List<Hobby> andreiHobbies = new ArrayList<>();

        andreiHobbies.add(hiking);

        //hashmap person plus hobby

        System.out.println("Hashmap print");

        Map<Person, List<Hobby>> hobbyMap = new HashMap<>();


        hobbyMap.put(mark, markHobbies);
        hobbyMap.put(andrei, andreiHobbies);

        System.out.println(hobbyMap + ", ");
    }
}