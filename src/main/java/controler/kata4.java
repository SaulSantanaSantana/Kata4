
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
    
    private String filename;
    private List<Mail> maillist;
    private Histogram<String> histogram;
    private HistogramDisplay histogramd;
    

    public kata4(String filename){
        this.filename = filename;
    }
    
    
    public void execute(){
        input();
        process();
        output();
    }
    
    public void input(){
        maillist = MailListReader.read(filename);
    }
    
    public void process(){
        histogram = MailHistogramBuilder.build(maillist);
    }
    
    public void output(){
        histogramd = new HistogramDisplay(histogram);
        histogramd.execute(); 
    }
    
    public static void main(String[] args) {
        kata4 control = new kata4("email.txt");
        control.execute();   
    }

    
}
