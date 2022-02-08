import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerSorter {
    public static void main(String[] args) {

        // Create a list of players using the Player Class Constructor
        List<Player> footballTeam = new ArrayList<Player>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        // Comparable Method
        System.out.println("Before Sorting : " + footballTeam);
        
        Collections.sort(footballTeam);
        
        System.out.println("After Sorting (by rank) : " + footballTeam);



        // Comparator Method
        System.out.println("Before Sorting : " + footballTeam);
        
        PlayerAgeComparator playerComparator = new PlayerAgeComparator();
        Collections.sort(footballTeam, playerComparator);
        
        System.out.println("After Sorting by age : " + footballTeam);


    }

}