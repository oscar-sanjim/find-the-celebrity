package com.company;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    /**
     * Test the process of getting the celebrity when input matches criteria
     */
    @org.junit.jupiter.api.Test
    public void getCelebrity() {
        int[][] relations = {
                {1, 1, 1, 1, 1},   // Andres
                {0, 1, 0, 1, 1},   // Michael
                {0, 1, 0, 1, 0},   // Oscar
                {0, 0, 0, 1, 0},   // Gloria - Celebrity
                {0, 1, 1, 1, 1},   // Ana
        };

        // Restriction: names length has to be the same as relations array first dimension length.
        String[] names = {"Andres", "Michael", "Oscar", "Gloria", "Ana"};

        Solution solution = new Solution(names, relations);     // Build the solution object with the provided data.
        Person celebrity = solution.getCelebrity();             // Get celebrity if exists.

        assertEquals("Gloria", celebrity.getName());
    }

    /**
     * Test the process of getting null when input doesn't match criteria
     */
    @org.junit.jupiter.api.Test
    public void noCelebrityCriteriaIsMet() {
        int[][] relations = {
                {1, 1, 1, 1, 1},   // Andres
                {0, 1, 0, 1, 1},   // Michael
                {0, 1, 0, 1, 0},   // Oscar
                {0, 0, 1, 1, 0},   // Gloria
                {0, 1, 1, 1, 1},   // Ana
        };

        // Restriction: names length has to be the same as relations array first dimension length.
        String[] names = {"Andres", "Michael", "Oscar", "Gloria", "Ana"};

        Solution solution = new Solution(names, relations);     // Build the solution object with the provided data.
        Person celebrity = solution.getCelebrity();             // Get celebrity if exists.

        assertNull(celebrity);
    }
}