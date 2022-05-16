package Aplicacao.Login;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Conectar.Conect;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * FXML Controller class
 *
 * @author jpc
 */
public class LoginViewController implements Initializable {

    @FXML
    TextField txfUsername;
    @FXML
    PasswordField txfPassword;
    @FXML
    Label lblErro;
    @FXML
    Button btLogin;
    @FXML
    Button btRegistar;
    

    @FXML
    public void buttonRegistar(ActionEvent e) {
           // ABRE OUTRA JANELA
    }

    @FXML
    public void buttonLogin(ActionEvent e){
        String username = txfUsername.getText();
        String password = txfPassword.getText();
          try { // V
              Connection con = Conectar.Conect.getCon();
                      Statement st =con.createStatement();
                      String query = "Select * from ihc";
                      ResultSet rs = st.executeQuery(query);
                      while(rs.next()){
                          String user = rs.getString("username");
                          String passw = rs.getString("password");
                          if(user.equals(username) && password.equals(passw)){
                              System.out.println("U");
                          }
                      }
          } catch (SQLException c) {
                    JOptionPane.showMessageDialog(null, c, "ERROR", JOptionPane.ERROR_MESSAGE);
                }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
