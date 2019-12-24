/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2.pkg1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Shreeni
 */
public class FXMLDocumentController implements Initializable {
  
    
    
    @FXML 
    private Button button0;
    @FXML 
    private Button button1;
    @FXML 
    private Button button2;
    @FXML 
    private Button button3;
    @FXML 
    private Button button4;
    @FXML 
    private Button button5;
    @FXML 
    private Button button6;
    @FXML 
    private Button button7;
    @FXML 
    private Button button8;
    @FXML 
    private Button btnrt;
    @FXML 
    private Button btnqt;
  
    
    @FXML
    private TextField txt01;
    @FXML
    private TextField txt02;
    @FXML
    private TextField txt03;
    
    
   NewClass n= new NewClass(); 
    
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int a1=n.check(0);
        
        if (a1==1)
        {
            button0.setText("x");
        }
        if(a1==-1)
        {
            button0.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
        
         
         
         
    }
    @FXML
    private void handleButtonAction1(ActionEvent event) {
        int a1=n.check(1);
        if (a1==1)
        {
            button1.setText("x");
        }
        if(a1==-1)
        {
            button1.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
         
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        int a1=n.check(2);
        
        if (a1==1)
        {
            button2.setText("x");
        }
        if(a1==-1)
        {
            button2.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
         
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
         


         
    }
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        int a1=n.check(3);
        if (a1==1)
        {
            button3.setText("x");
        }
        if(a1==-1)
        {
            button3.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
         
    }
    @FXML
    private void handleButtonAction4(ActionEvent event) {
        int a1=n.check(4);
        if (a1==1)
        {
            button4.setText("x");
        }
        if(a1==-1)
        {
            button4.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
     
    }
    @FXML
    private void handleButtonAction5(ActionEvent event) {
        int a1=n.check(5);
        if (a1==1)
        {
            button5.setText("x");
        }
        if(a1==-1)
        {
            button5.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
         
    }
    @FXML
    private void handleButtonAction6(ActionEvent event) {
        int a1=n.check(6);
        if (a1==1)
        {
            button6.setText("x");
        }
        if(a1==-1)
        {
            button6.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
        
    }
    @FXML
    private void handleButtonAction7(ActionEvent event) {
        int a1=n.check(7);
        if (a1==1)
        {
            button7.setText("x");
        }
        if(a1==-1)
        {
            button7.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
         
    }
    @FXML
    private void handleButtonAction8(ActionEvent event) {
        int a1=n.check(8);
        if (a1==1)
        {
            button8.setText("x");
        }
        if(a1==-1)
        {
            button8.setText("O");
        }
        int rwin=n.resetAfterWin();
        if (rwin==1)
        {
            resetlabel();
        }
        int twin1=n.tempWinner1();
        int twin2=n.tempWinner2();
        int tdraw=n.rdraw();
        printWins(twin1,twin2,tdraw);
        
    }
    private void resetlabel()
    {
        button0.setText("");
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
    }
    @FXML
    private void handleButtonActionrt(ActionEvent event) {
        button0.setText("");
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        txt01.setText("0");
        txt02.setText("0");
        n.resetbuttonact();
         
    }
    @FXML
    private void handleButtonActionqt(ActionEvent event) {
        Platform.exit();
         
    }
    
    private void printWins(int pwin,int pwin02,int pwin03)
    {
       String stp1 = Integer.toString(pwin);
       String stp2 = Integer.toString(pwin02);
       String stp3 = Integer.toString(pwin03);
       txt01.setText(stp1);
       txt02.setText(stp2);
       txt03.setText(stp3);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
