import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener {

    JButton button = new JButton("profile göster");

        public AnaSayfa(){
            button.addActionListener(this);
            button.setFocusable(false);
            button.setBounds(200,200,100,50);



            JFrame frame = new JFrame("Ana Sayfa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(null);
            frame.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


