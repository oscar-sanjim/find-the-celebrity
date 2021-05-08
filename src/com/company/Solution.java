package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {

    private String[] names;
    private int[][] relations;

    Logger logger = Logger.getLogger(Solution.class.getName());



    // -------------------------
    // --- Constructors
    // -------------------------

    public Solution(String[] names, int[][] relations) {
        this.names = names;
        this.relations = relations;

    }

    // -------------------------
    // --- Private Methods
    // -------------------------

    /**
     * Check if the person selected as possible celebrity meets the criteria.
     * @param persons List of persons in the input.
     * @param celebrity Possible celebrity
     * @return
     */
    private boolean checkIfCelebrity(List<Person> persons, Person celebrity){
        for(Person person : persons){
            if(person == celebrity) continue;
            if(!person.knowsPerson(celebrity) || celebrity.knowsPerson(person)){
                logger.log(Level.WARNING, "The persons didn't meet the celebrity criteria");
                return false;
            }
        }

        return true;
    }

    /**
     * Builds the Person objects to work with POO paradigm.
     * @return List of Persons in the data with their respective relations.
     */
    private List<Person> buildPersons(){
        List<Person> persons = new ArrayList<>();

        // Number of persons in arrays can't different, return empty array.
        if(this.names.length != this.relations.length){
            logger.log(Level.WARNING, "Names and Relations variables are not the same size.");
            return persons;
        }

        // Create the person objects by name.
        for(String name : this.names){
            persons.add(new Person(name));

        }

        // Associate the persons based on the realations input.
        for(int i=0; i < this.relations.length; i++){
            Person person = persons.get(i);
            for(int j=0; j < this.relations[i].length; j++){
                if(this.relations[i][j] == 1){
                    person.addKnownPerson(persons.get(j));

                }
            }
        }

        return persons;
    }

    // -------------------------
    // --- Public Methods
    // -------------------------
    /**
     * Finds a celebrity among the persons, based on the following criteiria:
     * Celebrity: is know by every other person and celebrity doesn't know any of the other persons.
     * @return Person object of the celebrity or null.
     */
    public Person getCelebrity() {
        List<Person> persons = buildPersons();      // Build the person objects.
        if (persons.size() <= 0) return null;        // If the list is empty, return null.

        // Get the best candidate to be a celebrity.
        Person celebrity = persons.get(0);
        for (Person person : persons) {

            if (celebrity.knowsPerson(person)) {    // If celebrity knows anyone, he/she can't be a celebrity.
                celebrity = person;                 // Get next candidate.

            }
        }

        return checkIfCelebrity(persons, celebrity) ? celebrity : null;

    }
}