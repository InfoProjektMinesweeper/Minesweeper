import java.awt.*;
import java.awt.event.*;

public class ANZEIGE_OBEN
{
    private Label Zeit;
    private Label Score;
    private int FontSize;
    private OBERFLAECHE Oberflaeche;
    private MAIN Main;
     
    public ANZEIGE_OBEN(OBERFLAECHE Oberflaeche, MAIN Main)
    {
        this.Oberflaeche = Oberflaeche;
        this.Main = Main;
        FontSize = Oberflaeche.Feld.getFontSize();
        
        
        Zeit = new Label(" Zeit: " + Main.getZeit(), Label.CENTER);
        Zeit.setSize(Oberflaeche.FensterX/2 , FontSize + 15);
        Zeit.setVisible(true);
        Zeit.setLocation(0, FontSize);
        Zeit.setFont(new Font("fontname", Font.PLAIN, FontSize));
        Zeit.setBackground(java.awt.Color.gray);
        Zeit.setForeground(java.awt.Color.white);
        Oberflaeche.FensterGeben().add(Zeit);
        
        
        Score = new Label("Score: " + Main.getScore(), Label.CENTER);
        Score.setSize(Oberflaeche.FensterX/2, FontSize + 15);
        Score.setVisible(true);
        Score.setLocation(Oberflaeche.FensterX/2, FontSize);
        Score.setFont(new Font("fontname", Font.PLAIN, FontSize));
        Score.setBackground(java.awt.Color.gray);
        Score.setForeground(java.awt.Color.white);
        Oberflaeche.FensterGeben().add(Score);
        
        
    
    }
    
    public int getLabelHeight(){
        return Zeit.getHeight();
    }
    
    public int getFontSize(){
        return FontSize;
    }
    
    public void ZeitUpdaten(){
        Zeit.setText(" Zeit: " + Main.getZeit());
    }
}
