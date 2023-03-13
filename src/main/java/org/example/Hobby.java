package org.example;

import java.util.List;

/**
 * This class is present in the main method as part of a hash map with Person class as id key.
 *
 */

public class Hobby {
    String name;
    int frequency;
    List<Address> address;

    public Hobby(String name, int frequency, List<Address> address) {
        this.name = name;
        this.frequency = frequency;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", address=" + address +
                '}';
    }
}

