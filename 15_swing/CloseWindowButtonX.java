import javax.swing.JFrame;

/**
 * Close the window with the X button
 * 
 */

public class CloseWindowButtonX {

    CloseWindowButtonX() {

        JFrame f = new JFrame("GridBagLayout Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(250, 200);
        f.setVisible(true);

    }

    public static void main(String[] args) {

        CloseWindowButtonX obj = new CloseWindowButtonX();

    }

}
