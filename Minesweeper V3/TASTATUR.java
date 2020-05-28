import java.awt.event.*;

public class TASTATUR implements KeyListener
{
    private MAIN Main;
    
    public TASTATUR(MAIN Main)
    {
        this.Main = Main;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
         
        if (e.getKeyCode() == 1) {
            
        }

    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}