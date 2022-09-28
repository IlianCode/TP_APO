package tools;


import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * NE PAS MODIFIER CETTE CLASSE
 * @author E Promayon (c) UJF - TIMC-IMAG
 */
public class JavaPlot {

    /** Affichage d'un signal 1D (tableau de double)
     * @param nom le nom du signal, affiché dans la fenêtre (dans le titre)
     * @param signal le tableau contenant les valeurs (taille quelconque)
     */
    public static void affiche(String nom, double signal[]) {
        XYSeries data = new XYSeries(nom);

        // simply consider signal as sampled every t
        for (int i = 0; i < signal.length; i++) {
            data.add(i, signal[i]);
        }
        XYDataset xyDataSet = new XYSeriesCollection(data);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Signal : " + nom, // Title
                "t", // X axis label
                "valeur", // Y axis label
                xyDataSet, // dataset
                PlotOrientation.VERTICAL, // orientation
                true, // legends
                true, // tool tips
                true);  // urls

        XYPlot plot = (XYPlot) chart.getPlot();
        XYItemRenderer r = plot.getRenderer();
        if (r instanceof XYLineAndShapeRenderer) {
            XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) r;
            renderer.setSeriesPaint(0, Color.blue);
            renderer.setUseFillPaint(true);
            renderer.setBaseFillPaint(Color.white);
            renderer.setSeriesShapesVisible(0, false);
            renderer.setSeriesShapesFilled(0, true);
        }


        ChartFrame frame = new ChartFrame(nom, chart);
        frame.setVisible(true);
        frame.setSize(512, 512);
    }
}
