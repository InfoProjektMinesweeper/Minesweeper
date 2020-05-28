import java.awt.event.*;

public class MAUS implements MouseListener
{
    private MAIN Main;
    
    public MAUS(MAIN Main)
    {
        this.Main = Main;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("X: " + e.getX() + " Y: " + e.getY()); 
        
    }

    
    
    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    
    @Override
    public void mousePressed(MouseEvent e) {

    }
    
}
