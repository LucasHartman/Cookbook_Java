import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainMenu {

    JFrame f;

    MainMenu() {

        f = new JFrame();

        // Create Panels
        JPanel nPanel = new JPanel();
        JPanel wPanel = new JPanel();
        JPanel sPanel = new JPanel();
        JPanel ePanel = new JPanel();
        JPanel cPanel = new JPanel();

        // Set Panel Color
        nPanel.setBackground(Color.YELLOW);
        wPanel.setBackground(Color.RED);
        sPanel.setBackground(Color.BLUE);
        ePanel.setBackground(Color.GREEN);
        cPanel.setBackground(Color.PINK);

        // Set Panel Size
        nPanel.setPreferredSize(new Dimension(30, 30));
        wPanel.setPreferredSize(new Dimension(30, 30));
        sPanel.setPreferredSize(new Dimension(30, 30));
        ePanel.setPreferredSize(new Dimension(30, 30));

        // MAIN: BorderLayout
        f.setLayout(new BorderLayout(20, 15));
        f.add(nPanel, BorderLayout.NORTH);
        f.add(wPanel, BorderLayout.WEST);
        f.add(sPanel, BorderLayout.SOUTH);
        f.add(ePanel, BorderLayout.EAST);
        f.add(cPanel, BorderLayout.CENTER);

        // set Frame
        f.setSize(300, 300);
        f.setVisible(true);

    }

    public static void main(String[] args) {

        new MainMenu();

    }

}