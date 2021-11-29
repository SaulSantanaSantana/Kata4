
package view;

/**
 *
 * @author saul
 */
package view;

import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mails){
        
        Histogram<String> histo = new Histogram<>();
        
        for(Mail m : mails)
            histo.increment(m.getDomain());
        
        return histo;
    }
    
}