public class Actor {

    private int x;
    private int y;
    private int dir =0;
    private int speed= 0;

    public Actor(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String display() {
            return 
             "\nposition x: " +x
            +"\nposition y: " +x
            +"\ndirection:  " +x
            +"\nspeed:      " +x;
    }



}