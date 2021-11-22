import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class closeWindow {

    public closeWindow() {
        JFrame f = new JFrame();  
        JPanel pnl = new JPanel(); 
        JButton b = new JButton("Close");

        actionCloseWindow(b);
        
        f.add(b);
        f.setSize(400, 400);    
        f.setVisible(true);   
    }


    // Close Application Actions
    public void actionCloseWindow(JButton b) {
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
               System.exit(0);
        }});  
    }


    public static void main(String[] args) {
        closeWindow obj = new closeWindow();
    }
}
