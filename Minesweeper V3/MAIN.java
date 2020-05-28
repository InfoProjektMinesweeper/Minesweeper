public class MAIN
{
    public FELD Feld;
    public MAUS Maus;
    public TASTATUR Tastatur;
    public OBERFLAECHE Oberflaeche;
    public ZEIT Zeit;
    
    private int Spielzeit = 0;
    private int Score = 0;
    
    public final int Feldbreite = 50;
    public final int FontSize = 25;
    
    public MAIN(String Schwierigkeit)
    {
        Feld = new FELD(Schwierigkeit, Feldbreite, FontSize);
        Maus = new MAUS(this);
        Tastatur = new TASTATUR(this);
        Oberflaeche = new OBERFLAECHE(this, Feld, Feld.getX(), Feld.getY());
        Zeit = new ZEIT(this, 1000);
        
        Zeit.Starten();
        
        System.out.println("Feld X: " + Feld.getX() + " Y: " + Feld.getY());
    }
    
    public MAIN()
    {
        Feld = new FELD("einfach", Feldbreite, FontSize);
        Maus = new MAUS(this);
        Tastatur = new TASTATUR(this);
        Oberflaeche = new OBERFLAECHE(this, Feld, Feld.getX(), Feld.getY());
        Zeit = new ZEIT(this, 1000);
        
        Zeit.Starten();
        
        System.out.println("Feld X: " + Feld.getX() + " Y: " + Feld.getY());

    }

    public void ZeitHoch(){
        Spielzeit++;
        Oberflaeche.AnzeigeOben.ZeitUpdaten();
    }
    
    public void ZeitStarten(){
        Zeit.Starten();
    }
    
    public int getZeit(){
        return Spielzeit;
    }
    
    public int getScore(){
        return Score;
    }
}
