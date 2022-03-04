import java.util.ArrayList;

public class testLab {

    private final float radius = 10;
    private float[][] neighborsPos;
    private float[] neighborsAngle;

    /*
    testLab(float x, float y, float angle) {

        neighbors = this.neighbors;

        for(float[] neighbor : neighbors) {
            float neighborDistance  = (float)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            float effectRate        = 100-((radius/100)*neighborDistance);
            float betweenAngle      = angle-neighborAngle;
            float steerRate         = (betweenAngle/100)*effectRate;
            float newAngle          = currentAngle+steerRate;
        }
    }
    

    public void setNeighborsPos(float[][] neighborsPos) {
        this.neighborsPos=neighborsPos;  
    }

    public float[][] getNeighborsPos() {
        return this.neighborsPos;
    }


    public void setNeighborsAngle(float[][] neighborsAngle) {
        this.neighborsAngle=neighborsAngle;  
    }

    public float[][] getNeighborsAngle() {
        return this.neighborsAngle;
    }
    */


    float neighborDistance(float x1, float y1, float x2, float y2) {
        // Calculate the distance between 2 vector points
        return (float)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    float effectRate(float radius, float neighborDistance) {
        // calculate the effect rate of the neighbor object
        // example:  radius=120, neighborDistance=20; return=76%
        return 100-((radius/100)*neighborDistance);
    }

    float steerAngle(float currentAngle, float neighborAngle, float effectRate) {
        // update the angle based on the angle of the neighbor
        // The boid needs to angle away from the neighbor
        // use the effectRate() method to calculate the force of steering away
        // example currentAngel=270, neighborAngle=180, effectRate=50% return=315 degree
        float betweenAngle = currentAngle-neighborAngle;
        float steerRate = (betweenAngle/100)*effectRate;
        return currentAngle+steerRate;
    }


    float bestAngle(float currentAngle, float[][] neighborsPos) {
        // Find the best angle based a the number of neighbors.angle in the radius
            float averageAngle = currentAngle;
            for (float[] pos : neighborsPos) {
                float dis =                 neighborDistance(0,0,pos[0],pos[1]);
                float neighborEffectRate =  effectRate(100, dis);
                float newAngle =            steerAngle(180,270,neighborEffectRate);
                
                averageAngle = (averageAngle + newAngle)/2;
            }
            return averageAngle;
        }
    

    void inputVararg(float... list) {
        for(float item: list) {
            System.out.println(item);
        }
    }

    void setNeighborList() {
        // set 
    }

    public static void main(String[] args) {

        testLab obj = new testLab();

        float x1 = 1;
        float y1 = 2;
        float x2 = 4;
        float y2 = 6;

        float dis = obj.neighborDistance(x1,x2,y1,y2);
        float neighborEffectRate = obj.effectRate(100, dis);
        float newAngle = obj.steerAngle(180,270,neighborEffectRate);

        System.out.println("distance between 2 points: " +dis);
        System.out.println("neighbor effect rate:      " +neighborEffectRate);
        System.out.println("boid new angle:            " +newAngle);


        float[][] neighborsPos = {{10,10}, {-20,-20}, {30,30}, {-40,-40} };

        float avAngle = obj.bestAngle(270, neighborsPos); 
        System.out.println("av Angle: " +avAngle);

        // Initialize 
        obj.inputVararg(1,2,3,4,5);

        // Create Actor List
        ArrayList<Actor> arr = new ArrayList<>();
        for(int i=0; i<3; i++) {
            arr.add(new Actor(0,0));
            }

        // Display Actor List data
        for(Actor a : arr) {
            System.out.println(a.display() );
        }
       
    }
}
