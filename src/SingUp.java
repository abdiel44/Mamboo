import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingUp extends JFrame implements ActionListener
{
    //First Name
    JPanel firstNamePanel = new JPanel();
    JLabel firstNameLabel = new JLabel();
    JTextField firstName = new JTextField();

    //Last Name
    JPanel lastNamePanel = new JPanel();
    JLabel lastNameLabel = new JLabel();
    JTextField lastName = new JTextField();

    //Password box
    JPanel passwordPanel = new JPanel();
    JLabel passwordLabel = new JLabel();
    JPasswordField password = new JPasswordField();

    //Username box
    JTextField userName = new JTextField();
    JPanel userPanel = new JPanel();
    JLabel userLabel = new JLabel();

    //Phone box
    JPanel phoneNumberPanel = new JPanel();
    JLabel phoneNumberLabel = new JLabel();
    JTextField phoneNumber = new JTextField();

    //Address box
    JPanel addressPanel = new JPanel();
    JLabel addressLabel = new JLabel();
    JTextField address = new JTextField();

    //Description box
    JPanel descriptionPanel = new JPanel();
    JLabel descriptionLabel = new JLabel();
    JTextField description = new JTextField();

    JButton submit = new JButton();
    JPanel backgroundPanel = new JPanel();
    JLabel logo = new JLabel(new ImageIcon(getClass().getResource("/Mamboo.png")));
    JLabel title = new JLabel();
    Color yellow = new java.awt.Color(255, 222, 89);
    Color black  = new java.awt.Color(0, 0, 0);
    Color white  = new java.awt.Color(255, 255, 255);
    Color blue   = new java.awt.Color(56, 182, 255);
    Font font14 = new java.awt.Font("Segoe UI", 1, 24);
    Font font40 = new java.awt.Font("Segoe UI", 3, 40);

    public SingUp()
    {
        setTitle("Mamboo");
        setSize(2000,1500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBackground(white);
        setVisible(true);

        backgroundPanel.setBackground(yellow);
        backgroundPanel.setLayout(null);

        logo.setBounds(650,10,250,250);

        title.setFont(font40);
        title.setText("Create Your Account");
        title.setBounds(900,90,600,60);

        firstNamePanel.setBackground(white);
        firstNamePanel.setBounds(200,250,600,100);
        firstNamePanel.setLayout(null);
        firstNameLabel.setFont(font14);
        firstNameLabel.setText("    First Name:");
        firstNameLabel.setBounds(10,10,300,30);
        firstName.setBackground(white);
        firstName.setFont(font14);
        firstName.setForeground(black);
        firstName.setBorder(null);
        firstName.setBounds(200,30,600,60);

        lastNamePanel.setBackground(white);
        lastNamePanel.setBounds(200,400,600,100);
        lastNamePanel.setLayout(null);
        lastNameLabel.setFont(font14);
        lastNameLabel.setText("    Last Name:");
        lastNameLabel.setBounds(10,10,300,30);
        lastName.setBackground(white);
        lastName.setFont(font14);
        lastName.setForeground(black);
        lastName.setBorder(null);
        lastName.setBounds(200,30,600,60);

        userPanel.setBackground(white);
        userPanel.setBounds(200,550,600,100);
        userPanel.setLayout(null);
        userLabel.setFont(font14);
        userLabel.setText("    User Name:");
        userLabel.setBounds(10,10,200,20);
        userName.setBackground(white);
        userName.setFont(font14);
        userName.setForeground(black);
        userName.setBorder(null);
        userName.setBounds(200,30,600,60);

        passwordPanel.setBackground(white);
        passwordPanel.setBounds(200,700,600,100);
        passwordPanel.setLayout(null);
        passwordLabel.setFont(font14);
        passwordLabel.setText("    Password:");
        passwordLabel.setBounds(10,10,200,20);
        password.setBackground(white);
        password.setFont(font14);
        password.setForeground(black);
        password.setBorder(null);
        password.setBounds(200,30,600,60);

        phoneNumberPanel.setBackground(white);
        phoneNumberPanel.setBounds(1100,250,600,100);
        phoneNumberPanel.setLayout(null);
        phoneNumberLabel.setFont(font14);
        phoneNumberLabel.setText("    Phone:");
        phoneNumberLabel.setBounds(10,10,200,20);
        phoneNumber.setBackground(white);
        phoneNumber.setFont(font14);
        phoneNumber.setForeground(black);
        phoneNumber.setBorder(null);
        phoneNumber.setBounds(200,30,600,60);

        addressPanel.setBackground(white);
        addressPanel.setBounds(1100,400,600,100);
        addressPanel.setLayout(null);
        addressLabel.setFont(font14);
        addressLabel.setText("    Address:");
        addressLabel.setBounds(10,10,200,20);
        address.setBackground(white);
        address.setFont(font14);
        address.setForeground(black);
        address.setBorder(null);
        address.setBounds(200,30,600,60);

        descriptionPanel.setBackground(white);
        descriptionPanel.setBounds(1100,550,600,250);
        descriptionPanel.setLayout(null);
        descriptionLabel.setFont(font14);
        descriptionLabel.setText("    Description:");
        descriptionLabel.setBounds(10,10,200,30);
        description.setBackground(white);
        description.setFont(font14);
        description.setForeground(black);
        description.setBorder(null);
        description.setBounds(100,40,600,200);

        submit.setBackground(blue);
        submit.setFont(font14);
        submit.setText("Submit");
        submit.setForeground(white);
        submit.setBorder(null);
        submit.setBounds(825,850,250,80);
        submit.addActionListener(this);

        //Adding
        add(backgroundPanel);
        backgroundPanel.add(firstNamePanel);
        backgroundPanel.add(lastNamePanel);
        backgroundPanel.add(userPanel);
        backgroundPanel.add(passwordPanel);
        backgroundPanel.add(phoneNumberPanel);
        backgroundPanel.add(addressPanel);
        backgroundPanel.add(descriptionPanel);
        backgroundPanel.add(title);
        backgroundPanel.add(logo);
        backgroundPanel.add(submit);

        firstNamePanel.add(firstNameLabel);
        firstNamePanel.add(firstName);

        lastNamePanel.add(lastNameLabel);
        lastNamePanel.add(lastName);

        userPanel.add(userLabel);
        userPanel.add(userName);

        passwordPanel.add(passwordLabel);
        passwordPanel.add(password);

        phoneNumberPanel.add(phoneNumberLabel);
        phoneNumberPanel.add(phoneNumber);

        addressPanel.add(addressLabel);
        addressPanel.add(address);

        descriptionPanel.add(descriptionLabel);
        descriptionPanel.add(description);




    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        if(command.equals("Submit"))
        {
           LogIn logIn = new LogIn();
        }
    }



}