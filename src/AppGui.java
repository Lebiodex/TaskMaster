import javax.swing.*;
import java.awt.*;
public class AppGui {

    public static void mainGui(){

            //MAIN FRAME
            JFrame frame = new JFrame("TaskMaster");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1500,1000);
            frame.setLayout(null);
            frame.setResizable(false);

            //HEADER
            JPanel header = new JPanel();
            header.setBounds(0,0,1500,50);
            header.setBackground(Color.blue);
            header.setLayout(new BorderLayout());

            //HEADER BUTTON
            JButton addButton = new JButton();
            addButton.setSize(60,40);
            header.add(addButton, BorderLayout.EAST);

            //ADDING
            frame.add(header);
    }
}
