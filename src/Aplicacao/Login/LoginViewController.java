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
import java.sql.Connection;
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
    public void buttonLogin(ActionEvent e) {
        String username = txfUsername.getText();
        String password = txfPassword.getText();
        try { // Vai buscar as passwords e verifica se existe alguma igual
            Connection con = Conectar.Conect.getCon();
            Statement st = con.createStatement();
            String query = "SELECT * FROM ihc WHERE username = '" + username + "' and password = md5('" + password + "');";
            // CONTROLO System.out.println(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {

                lblErro.setText("LOGIN FEITO COM SUCESSO!");

            } else {

                lblErro.setText("Os dados que inseriu não estão válidos!");
            }
        } catch (SQLException c) {
            System.out.println(c.getMessage());
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
