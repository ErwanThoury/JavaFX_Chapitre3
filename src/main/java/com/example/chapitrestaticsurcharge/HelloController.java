package com.example.chapitrestaticsurcharge;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label lblNom;
    @FXML
    private Label lblNomTitre;
    @FXML
    private TextField txtSalaire;
    @FXML
    private Label lblSalaire;

    Personne p;
    Personne p1;
    Personne p2;
    Personne p3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void testChangerSalaire(MouseEvent mouseEvent) {
        if(txtSalaire.getText().isEmpty())
            p.setSalaire();
        else {
            try // Try teste les lignes entre {} et, si il y a une erreur, effectue ce qu'il y a dans le catch(Exception e)
            {
                p1.setSalaire(Integer.parseInt(txtSalaire.getText()));
            }
            catch(Exception e){System.out.println(e);}
        }
        lblSalaire.setText(String.valueOf(p.getSalaire()));
    }
}