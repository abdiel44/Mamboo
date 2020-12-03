import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener
{
    JPanel backgroundPanel = new JPanel();
    JPanel controlPanel = new JPanel();
    JPanel post = new JPanel();
    JPanel search = new JPanel();


    JLabel logo = new JLabel(new ImageIcon(getClass().getResource("/Mamboo250.png")));
    JButton home = new JButton(new ImageIcon(getClass().getResource("/BlackHome..png")));
    JButton message = new JButton(new ImageIcon(getClass().getResource("/BlackMessage..png")));
    JButton profile = new JButton(new ImageIcon(getClass().getResource("/BlackProfile.png")));
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

        controlPanel.setBackground(white);
        controlPanel.setLayout(null);
        controlPanel.setBounds(0,0,350,1500);

        logo.setBounds(50,0,250,250);
        controlPanel.add(logo);

        home.setBounds(125,250,110,110);
        home.setBackground(null);
        home.setBorder(null);
        home.addActionListener(this);
        controlPanel.add(home);

        message.setBounds(125,530,110,110);
        message.setBackground(null);
        message.setBorder(null);
        message.addActionListener( this);
        controlPanel.add(message);

        profile.setBounds(125,800,110,110);
        profile.setBackground(null);
        profile.setBorder(null);
        profile.addActionListener( this);
        controlPanel.add(profile);

        post.setBackground(black);
        post.setBounds(350,0,1000,1500);



        add(backgroundPanel);
        backgroundPanel.add(controlPanel);
        backgroundPanel.add(post);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
