/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_laundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author DAIDHA
 */
public class Data_isian_laundryController implements Initializable {

    @FXML
    private Button OKE;
    @FXML
    private Button Hapus;
    @FXML
    private TextArea Hasil;
    @FXML
    private TextField Nama;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField BerCu;
    @FXML
    private TextField Telp;
    @FXML
    private RadioButton CK;
    @FXML
    private ToggleGroup pilihanpaket;
    @FXML
    private RadioButton CKS;
    @FXML
    private RadioButton S;
    @FXML
    private TextField Tgl_Ambil;
    @FXML
    private TextField Tgl_Antar;
    @FXML
    private TextField total;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
       String nama, alamat,telepon,tanggal,antar;
       String paket;
       int berat, Harga=0;
      
       nama = Nama.getText();
       alamat = Alamat.getText();
       berat = Integer.parseInt(BerCu.getText());
       telepon = Telp.getText();
       tanggal = Tgl_Ambil.getText();
      antar = Tgl_Antar.getText();
       if(CK.isSelected()){
           paket ="Cuci Setrika";
           Harga = berat*5000;
       }else if(CKS.isSelected()){
           paket ="Cuci Kering Setrika";
           Harga = berat*8000; 
       }else if(S.isSelected()){
           paket ="Setrika";
           Harga = berat*4000;
       }else{ 
           paket="";}

       
       Hasil.setText("Nama Pelanggan : "+nama+"\nAlamat Pelanggan : "+alamat+"\nBerat Cucian : "+berat+"\nNomor Telepon : "+telepon+
                "\nPilihan Paket Laundry : "+paket+"\nTotal Pembayaran : "+Harga+"\nTanggal Antar : "+antar+"\nTanggal Pengembalian : "+tanggal);
          
       
       
       
        
        
           
       }
           
      @FXML
    void hapus(ActionEvent event) {
        Hasil.setText("");
        Nama.setText("");
        Alamat.setText("");
        BerCu.setText("");
        Telp.setText("");
        CK.setSelected(false);
        CKS.setSelected(false);
        S.setSelected(false);
        Tgl_Ambil.setText("");
        Tgl_Antar.setText("");
        
        
    }  
       
    }


    


