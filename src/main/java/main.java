import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main implements ActionListener {

    private int count=0;

    private JFrame frame;
    private JLabel welcomelabel;
    private JLabel matineediscounts;
    private JLabel movielabel;
    private JLabel timelabel;
    private JLabel datelabel;
    private JLabel adult;
    private JLabel kid;
    private JPanel panel;
    private JTextField adults;
    private JTextField kids;
    private JLabel total;






     public main() {

         frame = new JFrame();
         welcomelabel = new JLabel("Welcome to Yadimar's Cinema Ticketing");
         welcomelabel.setForeground(Color.PINK);
         matineediscounts = new JLabel("Matinee Discount: $2 off");
         movielabel = new JLabel("Pick a movie:");
         String[] movielist = {"Harry Potter and the Goblet of Fire","Charlie and the Chocolate Factory","Soul","The Croods: A New Age","A Quiet Place Part II"};
         JComboBox moviecomboBox = new JComboBox(movielist);
         timelabel = new JLabel("Pick Time:");
         String[] Times = {"9AM","12PM","3PM","6PM"};
         JComboBox timescomboBox = new JComboBox(Times);
         datelabel = new JLabel("Pick a date:");
         String[] dates = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
         JComboBox datescomboBox = new JComboBox(dates);
         adult = new JLabel("Adult:");
         adults = new JTextField("");
         adults.addActionListener(this);
         kid = new JLabel("Kid:");
         kids = new JTextField("");
         kids.addActionListener(this);
         JButton button = new JButton("OK");
         button.addActionListener(this);
         total = new JLabel("");





      JPanel panel = new JPanel();
      panel.setBackground(Color.gray);
      panel.setBorder(BorderFactory.createEmptyBorder(80,150,50,150));
      panel.setLayout(new GridLayout(0,1));
      panel.add(welcomelabel); // Welcome message
         panel.add(matineediscounts); //discounts for matinee
         panel.add(movielabel); //Movie label
      panel.add(moviecomboBox); //Movie names drop down
      panel.add(timelabel); //Time label
      panel.add(timescomboBox); //Time drop down
      panel.add(datelabel);//Date label
      panel.add(datescomboBox);//Date drop down
      panel.add(adult);//Adult ticket
      panel.add(adults);//Number of adults
      panel.add(kid);//Kid ticket
      panel.add(kids);//Number of kids
      panel.add(button);//Total price
      panel.add(total);
      






      frame.add(panel, BorderLayout.CENTER);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Yadimar's Cinema");
      frame.pack();
      frame.setVisible(true);
     }

     public static void main(String[] args) {
         new main();
     }
     @Override
    public void actionPerformed(ActionEvent e) {
        count++;
         total.setText("Total:" +count);

     }

     }

