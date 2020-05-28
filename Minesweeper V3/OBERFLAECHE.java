import java.awt.*;
import java.awt.event.*;

public class OBERFLAECHE
{
    private TASTATUR Tastatur;
    private MAUS Maus;
    public FELD Feld;
    public ANZEIGE_OBEN AnzeigeOben;
    private static MAIN Main;
    private Frame fenster = null;
    private static OBERFLAECHE Oberflaeche = null;
    final int FensterX;
    final int FensterY;
    
    public OBERFLAECHE(MAIN Main, FELD Feld, int x, int y){
        this.Main = Main;
        this.Feld = Feld;
       
        Tastatur = new TASTATUR(Main);
        Maus = new MAUS(Main);
        
        
        FensterX = x;
        FensterY = y;
        
        fenster = new Frame ("Minesweeper");
        fenster.setResizable (false);
        fenster.setVisible (true);
        fenster.setLayout (null);
        fenster.setBackground (Color.blue);
        fenster.setSize (FensterX, FensterY);
        fenster.addKeyListener(Tastatur);
        fenster.addMouseListener(Maus);
        fenster.addWindowListener( new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent we) {
               System.exit(0);
            }
         } );
         Oberflaeche = this;
         
          AnzeigeOben = new ANZEIGE_OBEN(this, Main);
          System.out.println("Label Höhe: " + AnzeigeOben.getLabelHeight());
        }
    
    static Frame FensterGeben ()
    {
        if (Oberflaeche == null )
        {      
            Oberflaeche = new OBERFLAECHE (Main, Main.Feld, Main.Feld.getX(), Main.Feld.getY());
        }
        return Oberflaeche.fenster;
    }
}
