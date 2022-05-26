package Aplicacao.Menu;

import Aplicacao.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class MenuViewController implements Initializable {

    public Main m;

    @FXML
    Label lblUser;
    @FXML
    Label lblData;

    void setMainApp(Main mainApp) {
        this.m = mainApp;
    }

    @FXML
    public void buttonSair(ActionEvent e) {
        // ABRE OUTRA JANELA
    }

    @FXML
    public void buttonNovaEntra(ActionEvent e) {

    }

    @FXML
    public void buttonPesquisar(ActionEvent e) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
