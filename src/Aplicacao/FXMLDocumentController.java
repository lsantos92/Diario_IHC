package Aplicacao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    TextField txfNome;
    @FXML
    TextField txfCurso;
    @FXML
    TextField txfNum;

    @FXML
    public void buttonRegistar(ActionEvent e) {
        String nome = txfNome.getText();
        String curso = txfCurso.getText();
        String numero = txfNum.getText();
        System.out.println("Ola " + " " + nome +" "+ curso+ " " + numero);
    }

    @FXML
    public void buttonCancelar(ActionEvent e) {
        txfNome.clear();
        txfCurso.clear();
        txfNum.clear();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
