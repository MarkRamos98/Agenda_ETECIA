/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/**
 *
 * @author Laboratorio-Info
 */
public class Press_DAO {
    
    public static void imprime()throws Exception {
 
        Document doc = null;
        OutputStream os = null;
    String x = JOptionPane.showInputDialog(null, "Digite o seu nome ?");
    String y = JOptionPane.showInputDialog(null, "Digite a data  ?");  
  try {
 
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
 
            //cria a stream de saída
            os = new FileOutputStream("Relatorio1.pdf");
 
            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);
 
            //abre o documento
            doc.open();
 
            //adiciona o texto ao PDF
            Paragraph par = new Paragraph("ATESTADO MÉDICO   \n Nome : " + x +"  \n e a data é  " + y);
            doc.add(par);
            Paragraph par2 = new Paragraph("ATESTADO MÉDICO   \n Nome : " + x +"  \n e a data é  " + y);
            doc.add(par2);
 
        } finally {
 
            if (doc != null) {
 
                //fechamento do documento
                doc.close();
            }
 
            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        Desktop.getDesktop().open(new File("Relatorio1.pdf"));
    }
        

}