import javax.swing.*;
import java.awt.*;

public class Movielist {

        public Movielist(){
            JFrame frame = new JFrame();

            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(80,150,50,150));
            panel.setLayout(new GridLayout(0,1));


            frame.add(panel,BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Movie List");
            frame.pack();
            frame.setVisible(true);
        }



    public static void main(String[] args) {
        new main();
    }

}


