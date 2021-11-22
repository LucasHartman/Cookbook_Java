import java.awt.*;    
import javax.swing.*;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
    public class VerticalLayout extends Frame {    
    
        Button buttons[];    
    
        // constructor of the class  
        public VerticalLayout() {

        // Declare
        JFrame f = new JFrame();  
        JPanel pnl = new JPanel();  
        TextField tf=new TextField();  
        buttons = new Button[5];  
        GridBagConstraints constrntObj = new GridBagConstraints();  

        // Add Elements
        add(tf);
        constrntObj.fill = GridBagConstraints.VERTICAL;  
        for (int i = 0; i < 5; i++) {    
            buttons[i] = new Button ("Button " + (i + 1));   
            add(buttons[i]);    
        }    
        
        // add Action to Button
        actionSetText(buttons[0], tf, "Welcome to Spain.");
        actionSetText(buttons[1], tf, "Welcome to Japan.");
        actionSetText(buttons[2], tf, "Welcome to USA.");
        actionSetText(buttons[3], tf, "Welcome to Netherlands.");
        actionSetText(buttons[4], tf, "Welcome to China.");
        
        // set Layout 
        tf.setBounds(50,50, 150,20);
        setLayout (new BoxLayout(this, BoxLayout.PAGE_AXIS));    
        setSize(400, 400);    
        setVisible(true);    
    }    


    // Button Action: set Text
    public void actionSetText(Button b, TextField tf, String text) {
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                    tf.setText(text);  
        }});  
    }



    // main method  
    public static void main(String argvs[]) {    
        VerticalLayout obj = new VerticalLayout();  
    }    
}    