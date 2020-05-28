import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;

public class ZEIT implements ActionListener
{

    private Timer Timer;
    private MAIN Main;
    
    ZEIT(MAIN Main, int dauer)
    {
        Timer = new Timer(dauer, this);
        this.Main = Main;
    }

    public void actionPerformed (ActionEvent evt)
    {
        Main.ZeitHoch();
    }

    public void Starten ()
    {
        Timer.start();
    }

    public void Anhalten ()
    {
        Timer.stop();
    }
    
}

