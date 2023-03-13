package org.example;

/**
 * Constructor of the Address class which is necessary in order to create the list which is used by the Hobby class
 * @author Mark
 */

public class Address {
    String country;

    public Address(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return country;
    }
}
