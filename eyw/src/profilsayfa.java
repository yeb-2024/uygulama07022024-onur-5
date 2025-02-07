import javax.swing.*;
import java.awt.*;

public class profilsayfa {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();


    public profilsayfa() {

        label.setText("Prof ");
        label.setFont(new Font(null,Font.PLAIN,25));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profilsayfa");
        frame.setLayout(new GridLayout( 3,1));
        frame.setVisible(true);

    }

}
