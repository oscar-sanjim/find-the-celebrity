# Coding Interview Excercise
### Problem: Find the Celebrity
**Description**: In a team of N people, a celebrity is known by everyone but he/she doesn't know anybody.
## Prerequisites
1. Java 8
2. JUnit 5 
## Running the program
1. Download the source code from this repository
2. Change directory to the "src" folder
3. Compile the Main class
    ```
    javac com/company/Main
    ```
4. Execute the program
    ```
    java com.company.Main
    ``` 
5. The expected result is the name of the person the system identifies as a celebrity

## Testing the program
1. Unit tests are defined in the SolutionTest class
2. Data can be manipulated to expect different results
3. Modify "relations" variable to change the relation between each of the persons
4. Each index of the first dimension of the "relations" array represents a person
5. Each index of the second dimension of the "relations" array represents whether the person "a" knows the person "b" or not. 1 for yes, 0 for no.
6. Modify "names" variable to update the name or number of persons in the input
7. **Note:** "relations" and "names" variables must be the same length.