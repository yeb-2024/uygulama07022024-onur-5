import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener {

    JButton button = new JButton("profile göster");
    JFrame frame = new JFrame();

        public AnaSayfa(){
            button.addActionListener(this);
            button.setFocusable(false);
            button.setBounds(200,200,100,50);



            JFrame frame = new JFrame("Ana Sayfa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.add(button);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                frame.dispose();
                profilsayfa profilsayfa = new profilsayfa();

            }


    }
}


