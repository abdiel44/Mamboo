import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.*;


public class LogIn extends JFrame implements ActionListener
{

    //Username box
    JTextField userName = new JTextField();
    JPanel userPanel = new JPanel();
    JLabel userLabel = new JLabel();

    //Password box
    JPanel passwordPanel = new JPanel();
    JLabel passwordLabel = new JLabel();
    JPasswordField password = new JPasswordField();

    // Buttons and decoration
    JPanel backgroundPanel = new JPanel();
    JLabel logo = new JLabel(new ImageIcon(getClass().getResource("/Mamboo..png")));
    JLabel title = new JLabel();
    JButton logIn = new JButton();
    JButton singUp = new JButton();
    Color yellow = new java.awt.Color(255, 222, 89);
    Color black  = new java.awt.Color(0, 0, 0);
    Color white  = new java.awt.Color(255, 255, 255);
    Color blue   = new java.awt.Color(56, 182, 255);
    Font font14 = new java.awt.Font("Segoe UI", 1, 24);
    Font font40 = new java.awt.Font("Segoe UI", 3, 40);

public LogIn(){
    setTitle("Mamboo");
    setSize(2000,1500);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setBackground(white);
    setVisible(true);

    backgroundPanel.setBackground(yellow);
    backgroundPanel.setLayout(null);


    logo.setBounds(730,5,500,500);

    //To set the style of the page title
    title.setFont(font40);
    title.setText("Log in to Mamboo");

    //set the style of the userName input area
    userPanel.setBackground(white);
    userPanel.setBounds(700,500,600,100);
    userPanel.setLayout(null);

    userLabel.setFont(font14);
    userLabel.setText("    User Name:");
    userLabel.setBounds(10,10,200,20);

    userName.setBackground(white);
    userName.setFont(font14);
    userName.setForeground(black);
    userName.setBorder(null);
    userName.setBounds(200,30,600,60);

    //to set the style of the password input area
    passwordPanel.setBackground(white);
    passwordPanel.setBounds(700,650,600,100);
    passwordPanel.setLayout(null);


    passwordLabel.setFont(font14);
    passwordLabel.setText("    Password:");
    passwordLabel.setBounds(10,10,200,20);

    password.setBackground(white);
    password.setFont(font14);
    password.setForeground(black);
    password.setBorder(null);
    password.setBounds(200,30,600,60);


    //to set the style of logIn button
    logIn.setBackground(blue);
    logIn.setFont(font14);
    logIn.setText("Log In");
    logIn.setForeground(white);
    logIn.setBorder(null);
    logIn.setBounds(875,800,250,40);
    logIn.addActionListener(this);

    //to set the style of SingUp button
    singUp.setBackground(null);
    singUp.setFont(font14);
    singUp.setForeground(blue);
    singUp.setText("Sing Up for Mamboo");
    singUp.setBorder(null);
    singUp.setBounds(875,900,250,40);
    singUp.addActionListener(this);

    //Adding
    add(backgroundPanel);
    backgroundPanel.add(userPanel);
    userPanel.add(userLabel);
    userPanel.add(userName);
    backgroundPanel.add(passwordPanel);
    passwordPanel.add(passwordLabel);
    passwordPanel.add(password);
    backgroundPanel.add(singUp);
    backgroundPanel.add(logIn);
    backgroundPanel.add(logo);

}

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        if(command.equals("Log In"))
        {
            String user = this.userName.getText();     //to save the userName from the text field;
            String password = this.password.getText(); //to save the password from the text field

            LogInModel logIn = new LogInModel(user, password); //to send the data to the logInModel
            if(LogInModel.existe)
            {
                this.dispose();
            }

        }else if(command.equals("Sing Up for Mamboo"))
        {
            SingUp singUp = new SingUp();
            this.dispose();
        }
    }
}
