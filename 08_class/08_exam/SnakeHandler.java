class Snake {}

class Cobra extends Snake {}

class GardenSnake extends Cobra {}



public class SnakeHandler {
    
    // instance variable
    private Snake snake;  // type Class
    
    // Setter
    public void setSnake( Snake snake ) { this.snake = snake; }
    


    public static void main(String[] args) {

        // Object reference.method()
        new SnakeHandler().setSnake( new Snake() ); // requires an instance of Sanke
        new SnakeHandler().setSnake( new Cobra() ); // or subtype of snake
        new SnakeHandler().setSnake( new GardenSnake() ); // or subtype of snake
        new SnakeHandler().setSnake( null ); //  a null value can always be passed as an object value
    }
}