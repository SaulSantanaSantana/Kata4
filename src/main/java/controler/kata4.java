/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

/**
 *
 * @author saul
 */
public class kata4 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        
        List<Mail> list = MailListReader.read("email.txt");
        Histogram histo = MailHistogramBuilder.build(list);
        
        HistogramDisplay histogram = new HistogramDisplay(histo);
        histogram.execute();
    }

    
}
