/**
 * 
 * Source: https://www.baeldung.com/java-comparator-comparable
 * 
 * 
 * How to create a player class, create a number of player and sort them by field
 * 
 * Steps:
 * 
 * SETUP
 * 1. We create a player class, with a ranking, name and age field
 * 2. Create a Concstructor that assign argument to the fields
 * 3. Create get and set method for all the fields
 * 4. Create a new class (PlayerSorter.java) were we can create our players
 * 5. Create an Arraylist and add a number of players, using the Player Constructor
 * 
 * SORTER
 * We got our players, with names, age and rank, but how can we sort them by rank or age or even name?
 * 
 * 
 * Comparable Method
 * - The Comparator interface returns an int.
 * 
 * https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-lang/src/main/java/com/baeldung/comparable
 * 
 * 
 * Comparator Method
 * 
 * https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-lang/src/main/java/com/baeldung/comparator
 * 
 * 
 */




/* Here we implement the "Comparable Interface" and defining the argument type
We use the "Player class", because we want to sort the players. */
public class Player implements Comparable<Player> {

    private int ranking;

    private String name;

    private int age;

    // Constructor
    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }


    // Getters & Setters

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    /*
    @override       we want to edit the compareTo function
    compareTo()     compare to values and returns a int value
                    - Negative value means taht the first object is smaller than second object
                    - The value 0 means the two object are equal
                    - Positive value means that the first object is larger than the second object
    compare()       Accepts 2 argument and returns an integer value
    getRanking()    A custom method to get Ranking from the player class
    */
    
    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }


}