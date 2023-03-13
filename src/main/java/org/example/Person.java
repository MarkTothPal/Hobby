package org.example;

import java.util.Objects;

/**
 * This class has the roll to construct the Person class object and overrides the default equals.
 * @author Mark
 */
public class Person {
    public String name;
    public Integer age;

    public Person(String name, int age){
        this.name= name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Person person = (Person) o;

        if (!Objects.equals(name, person.name)) {
            return false;
        }
        return Objects.equals(age, person.age);
    }

    @Override
    public int hashCode()
    {
        int result;
        if (name != null) result = name.hashCode();
        else result = 0;
        if (age != null) result = 31 * result + age.hashCode();
        else result = 31 * result;
        return result;
    }
}
