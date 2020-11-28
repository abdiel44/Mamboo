import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame
{
    JPanel backgroundPanel = new JPanel();
    JLabel label = new JLabel();

    Color yellow = new java.awt.Color(255, 222, 89);
    Color black  = new java.awt.Color(0, 0, 0);
    Color white  = new java.awt.Color(255, 255, 255);
    Color blue   = new java.awt.Color(56, 182, 255);
    Font font14 = new java.awt.Font("Segoe UI", 1, 24);
    Font font40 = new java.awt.Font("Segoe UI", 3, 70);
    public Dashboard()
    {
        setTitle("Mamboo");
        setSize(2000,1500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(white);
        setVisible(true);

        backgroundPanel.setBackground(yellow);
        backgroundPanel.setLayout(null);

        label.setText("ENTRADA EXITOSA");
        label.setBounds(600, 300, 1000, 300);
        label.setFont(font40);

        add(backgroundPanel);
        backgroundPanel.add(label);

    }
}
