import java.awt.*;
import javax.swing.*;

/**
 * Create A gridLayout inside BorderLayout
 * 
 */

public class NestedLayout {

    JFrame jframe;

    // constructor
    NestedLayout() {

        // FRAME
        jframe = new JFrame();

        // CENTURE: GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 1)); // Gridout into Panel
        JButton btn11 = new JButton("1");
        JButton btn12 = new JButton("2");
        JButton btn13 = new JButton("3");
        JButton btn14 = new JButton("4");
        JButton btn15 = new JButton("5");
        JButton btn16 = new JButton("6");
        JButton btn17 = new JButton("7");
        JButton btn18 = new JButton("8");
        JButton btn19 = new JButton("9");
        panel.add(btn11);
        panel.add(btn12);
        panel.add(btn13);
        panel.add(btn14);
        panel.add(btn15);
        panel.add(btn16);
        panel.add(btn17);
        panel.add(btn18);
        panel.add(btn19);

        // SOUTH: GridLayout
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 9)); // Gridout into Panel
        JButton btn21 = new JButton("1");
        JButton btn22 = new JButton("2");
        JButton btn23 = new JButton("3");
        JButton btn24 = new JButton("4");
        JButton btn25 = new JButton("5");
        JButton btn26 = new JButton("6");
        JButton btn27 = new JButton("7");
        JButton btn28 = new JButton("8");
        JButton btn29 = new JButton("9");
        panel2.add(btn21);
        panel2.add(btn22);
        panel2.add(btn23);
        panel2.add(btn24);
        panel2.add(btn25);
        panel2.add(btn26);
        panel2.add(btn27);
        panel2.add(btn28);
        panel2.add(btn29);

        // MAIN: BoraderLayout
        JButton btn1 = new JButton("NORTH");
        JButton btn2 = new JButton("SOUTH");
        JButton btn3 = new JButton("EAST");
        JButton btn4 = new JButton("WEST");
        jframe.setLayout(new BorderLayout(20, 15));
        jframe.add(btn1, BorderLayout.NORTH);
        jframe.add(panel2, BorderLayout.SOUTH);
        jframe.add(btn3, BorderLayout.EAST);
        jframe.add(btn4, BorderLayout.WEST);
        jframe.add(panel, BorderLayout.CENTER); // Panel to BorderLayout

        // set Frame
        jframe.setSize(300, 300);
        jframe.setVisible(true);
    }

    // main method
    public static void main(String argvs[]) {
        new NestedLayout();
    }
}