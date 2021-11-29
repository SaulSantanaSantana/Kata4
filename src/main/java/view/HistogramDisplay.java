/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author saul
 */

import java.awt.Dimension;
import javax.swing.JPanel;
import model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    private final Histogram<String> histogram;
    
    public HistogramDisplay(Histogram<String> histogram){
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
    
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma JFreeChart", "Dominios email","Nº de emails",
                dataset, PlotOrientation.VERTICAL,false,false, rootPaneCheckingEnabled);
        return chart;
    }
    
    
    private DefaultCategoryDataset createDataset(){
        
        String[] mails = {"gmail.com", "hotmail.es","ulpgc.es",};
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        

        for (String key : histogram.keySet()) {
            dataset.addValue(histogram.get(key), "", key);
        }

        return dataset;
    }
    
}
