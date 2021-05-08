package com.company;


// Problem: Find the Celebrity
// In a team of N people, a celebrity is known by everyone but he/she doesn't know anybody.

public class Main {


    public static void main(String[] args) {

        // Person identified by index in first dimension.
        // Relationships identified by 0 (no), 1 (yes) in second dimension.
        // Restrictions: Array has to be n x n.
        int[][] relations = {
                {1, 1, 1, 0},   // Andres
                {0, 1, 0, 0},   // Michael (Celebrity)
                {0, 1, 1, 0},   // Oscar
                {0, 1, 1, 1},   // Ana
        };

        // Restriction: names length has to be the same as relations array first dimension length.
        String[] names = {"Andres", "Michael", "Oscar", "Ana"};

        Solution solution = new Solution(names, relations);     // Build the solution object with the provided data.
        Person celebrity = solution.getCelebrity();             // Get celebrity if exists.
        System.out.println((celebrity != null) ? celebrity.getName() : "");

    }
}
