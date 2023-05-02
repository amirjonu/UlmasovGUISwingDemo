import javax.swing.*;
import java.awt.event.*;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener{
    private JPanel mainPanel;
    private JTextField Username;
    private JPasswordField Password;
    private JLabel Iloveturtles;
    private JButton YouAreAwsome;

    public MainGUIWindow(){
        createUIComponents();
    }

    private void createUIComponents(){
        setContentPane(mainPanel);
        setTitle("My GUI");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        YouAreAwsome.addActionListener(this);
        Username.addKeyListener(this);
        Password.addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            Iloveturtles.setText("I have sent ur info to a magical universe");
        }
    }

    @Override
    public void keyTyped(KeyEvent e){
        Object source = e.getSource();
        if (source instanceof JTextField){
            Iloveturtles.setText("I enjoy playing with turtles");

        }
    }

    @Override
    public void keyPressed(KeyEvent e){
        Object source = e.getSource();
        if (source instanceof JTextField){
            Iloveturtles.setText("I have sent ur info to a magical universe");

        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        Object source = e.getSource();
        if (source instanceof JTextField){
            Iloveturtles.setText("I have sent ur info to a magical universe");

        }
    }


}
