import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UserManager {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Alex\\IdeaProjects\\sda_curs\\src\\diet.jpg");
        //Color color = new Color(System.in);

        Border border =  BorderFactory.createLineBorder(Color.green,10);

        JLabel label = new JLabel();// creat a label
        label.setText("RoX Fitness Plan");
        label.setIcon(image);
        label.setIconTextGap(22);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setForeground(new Color( 0x00FF000));
        label.setFont(new Font("Italic",Font.PLAIN,50));
        label.setBorder(label.getBorder());
        label.setVerticalAlignment(JLabel.CENTER);
        label.setIconTextGap(70);
        label.setBorder(border);

        label.setBackground(Color.black);
        label.setOpaque(true);
       // label.setHorizontalTextPosition(200);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.add(label);

    }
}