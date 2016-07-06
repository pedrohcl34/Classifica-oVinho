package classificaçãovinho;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import classificaçãovinho.entidades.Vinho;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 *
 * @author Pedro Lima
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    TableView tabelaTupla;
    @FXML
    TableColumn <Vinho, Float> acidezFixa;
    @FXML
    TableColumn<Vinho, Float> acidezVolatil;
    @FXML
    TableColumn<Vinho, Float> acidoCitrico; 
    @FXML
    TableColumn<Vinho, Float> residuosDeAcucar;
    @FXML
    TableColumn<Vinho, Float> cloridos; 
    @FXML
    TableColumn<Vinho, Float> dioxidoDeEnxofre;
    @FXML
    TableColumn<Vinho, Float> dioxidoDeEnxofreTotal; 
    @FXML
    TableColumn<Vinho, Float> densidade;
    @FXML
    TableColumn<Vinho, Float> ph;
    @FXML
    TableColumn<Vinho, Float> sulfato;
    @FXML
    TableColumn<Vinho, Float> alcool;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabelaTupla.getItems().add(new Vinho(0, 0, 0,0,0,0, 0,0, 0, 0, 0, 10));
       //acidezFixa.setCellFactory(TextFieldTableCell.forTableColumn());
       
      tabelaTupla.setEditable(true);
    }

}
