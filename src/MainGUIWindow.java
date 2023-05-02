import javax.swing.*;
import java.awt.event.*;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener{
    private JPanel mainPanel;
    private JTextArea myTextArea;
    private JTextField textField1;
    private JButton clickIfCoolButton;
    private JButton clickIfVeryCoolButton;
    private JLabel label1;
    private JTextArea textArea1;

    public MainGUIWindow(){
        createUIComponents();
    }

    private void createUIComponents(){
        setContentPane(mainPanel);
        setTitle("My GUI");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        clickIfCoolButton.addActionListener(this);
        clickIfVeryCoolButton.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            if (text.equals("Click if cool")){
                myTextArea.append("button 1 clicked! ");
            }else{
                myTextArea.append("button 2 clicked! ");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e){
        Object source = e.getSource();
        if (source instanceof JTextField){
            myTextArea.append("Key typed");

        }
    }

    @Override
    public void keyPressed(KeyEvent e){
        Object source = e.getSource();
        if (source instanceof JTextField){
            myTextArea.append("Key pressed");

        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        Object source = e.getSource();
        if (source instanceof JTextField){
            myTextArea.append("Key released");

        }
    }
}