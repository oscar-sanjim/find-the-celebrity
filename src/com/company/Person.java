package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Person> knownPeople;

    // -------------------------
    // --- Constructors
    // -------------------------


    public Person(String name) {
        this.name = name;
        this.knownPeople = new ArrayList<>();

    }


    // -------------------------
    // --- Public Methods
    // -------------------------

    /**
     * Name accesor
     *
     * @return Name of the Person object
     */
    public String getName() {
        return name;

    }

    /**
     * Adds a person object to the associated list.
     *
     * @param person
     */
    public void addKnownPerson(Person person) {
        this.knownPeople.add(person);

    }

    /**
     * Checks if this knows the passed Person
     *
     * @param p Person object to look for
     * @return Whether the person is known or not
     */
    public boolean knowsPerson(Person p) {
        return this.knownPeople.contains(p);

    }
}