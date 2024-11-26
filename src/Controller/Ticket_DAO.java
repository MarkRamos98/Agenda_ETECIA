/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
 



public class Ticket_DAO {
    
       public static void impressao(){
        
        String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
           
        LocalDate data = java.time.LocalDate.now();
        String recebe = data.format(DateTimeFormatter.ISO_DATE);
        Frame f = new Frame("Imp");
        Toolkit tk = f.getToolkit();
        PrintJob pj = tk.getPrintJob(f, "Recibo", null);
        if (pj != null) {
            Graphics m = pj.getGraphics();
             m.drawString("FIAP PAULISTA", 1, 60);
             m.drawString("Senha Preferencial", 1, 80);
             m.drawString("Senha: "  , 1, 100);
             m.drawString("Data: " + recebe , 0, 120);
             m.drawString("Olá " + nome +" Seja bem-vindo", 0, 140);
            m.dispose();
            m.finalize();
            pj.end();
            pj.finalize();
        }
        f.dispose();
    }

}
