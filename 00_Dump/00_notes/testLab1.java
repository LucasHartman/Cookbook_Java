import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
- Create actors and spaceship
- Find spaceship neighbors within its search radius
- Create a list of neighbor + distance value
- Sort neighbors list by its distance
*/

class Actor {
    // Construct an Actor
    public int x;
    public int y;
    public int dir;                 // pointing direction
    public final int radius= 555;   // search radius

    Actor(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
}

class Neighbor {
    /*  Construct Neighbor and store actor / distance from spaceship
        This class is Actor and their distance, 
        within the radius of the spaceship */
    public Actor actor;
    public int dis;    // distance from

    Neighbor(Actor a, int dis) {
        this.actor = a;
        this.dis = dis; 
    }

    public int getDis() {
        return dis;
    } 

    @Override
    public String toString() {
        return "Neighbor{" +
                "distance='" + dis + '\'' +
                '}';
    }
}

public class testLab1 {

    ArrayList<Neighbor> neighbors = new ArrayList<Neighbor>();
    static Actor[] actorList = { new Actor(12,11,90), new Actor(23,22,180),new Actor(33,33,270) };
    static Actor spaceShip = new Actor(4,44,90);


    static int getDistance(int x1, int y1, int x2, int y2) {
        // Calculate the distance between 2 vector points
        return (int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    static List<Neighbor> getNeighbors (Actor spaceShip, Actor[] actorList) { 
        /*  Calculate the distance between spaceship and all actors
            Actors within the radius of the spaceship are called neighbors
            neighbors are added to the neighbors list */
        List<Neighbor> neighbors = new ArrayList<>();
        for (Actor a : actorList ) {
            int dis = getDistance(spaceShip.x, spaceShip.y, a.x, a.y);
            if (dis < spaceShip.radius) {neighbors.add(new Neighbor(a,dis));}
        } return neighbors;
    }

    static List<Neighbor> sortNeighbors(List<Neighbor> neighbors) {
        // Sort Neighbors list
        List<Neighbor> sortedNeighbors = neighbors.stream()
        .sorted(Comparator.comparingInt(Neighbor::getDis))
        .collect(Collectors.toList());
        
        sortedNeighbors.forEach(System.out::println);
        
        return sortedNeighbors;
    }


    int effectRate(int radius, int neighborDistance) {
        // calculate the effect rate of the neighbor object
        // example:  radius=120, neighborDistance=20; return=76%
        return 100-((radius/100)*neighborDistance);
    }


    public static void main(String[] args) {
        List<Neighbor> neighbors = sortNeighbors(new ArrayList<>(getNeighbors(spaceShip,actorList)));
    }
}