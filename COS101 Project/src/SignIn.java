/*
Grace George
4120272
 */

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class SignIn extends JFrame {

    private JPanel pnlMain;
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtSurn;
    private JLabel pnlName;
    private JLabel pnlSurname;
    private JLabel pnlEmail;
    private JButton btnNext;

    public SignIn() {
        setContentPane(pnlMain);
        setTitle("Sign in");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 700);
        setLocationRelativeTo(null);
        setVisible(true);

        String name = txtName.getText();
        String surn = txtSurn.getText();
        String email = txtEmail.getText();

        UserInfo newUser = new UserInfo();
        newUser.setName(name);
        newUser.setSurn(surn);
        newUser.setEmail(email);

        try {
            File infoText = new File("C:\\Users\\ggeor\\IdeaProjects\\COS101 Project\\src\\userInfo.txt");
            FileWriter infoWriter = new FileWriter("userInfo.txt");

            if (infoText.createNewFile()) {
                System.out.println("File created: " + infoText.getName());
                System.out.println("Absolute path: " + infoText.getAbsolutePath());
            } else {
                System.out.println("File already exists.");

                infoWriter.write(name + ", " + surn + ", " + email);
                infoWriter.close();




            }

        }
        catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }





    }

    public static void main(String[] args) {
        new SignIn();
    }





}
