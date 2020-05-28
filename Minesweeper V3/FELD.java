import java.io.*; 
import java.util.*;

public class FELD
{
    public final int FelderX;
    public final int FelderY;
    public final int MinenAnzahl;
    private final int Feldbreite;
    private final int FontSize;
    public int[][] IntArr;
    
    public FELD(String Schwierigkeit, int NeueFeldbreite, int NeueFontSize)
    {
        Feldbreite = NeueFeldbreite;
        FontSize =  NeueFontSize;
        
        Random random = new Random();
        
        switch(Schwierigkeit){
        
            case "einfach":
                FelderX = 8;
                FelderY = 8;
                MinenAnzahl = 10;
            break;
            
            case "mittel":
                FelderX = 16;
                FelderY = 16;
                MinenAnzahl = 40;
            break;
            
            case "schwer": 
                FelderX = 30;
                FelderY = 16;
                MinenAnzahl = 99;
            break;
            
            default:
                FelderX = 8;
                FelderY = 8;
                MinenAnzahl = 10;
            break;
        
        }
        
        IntArr = new int[FelderX][FelderY];
        
        for(int i = 0; i < MinenAnzahl; i++){
            int randomintx = random.nextInt(FelderX);
            int randominty = random.nextInt(FelderY);
            
            if(IntArr[randomintx][randominty] == 0){
                IntArr[randomintx][randominty] = 1;
            }
            else{
                int rix = random.nextInt(FelderX/6);
                int riy = random.nextInt(FelderY/6);
                IntArr[randomintx-rix][randominty-riy] = 1;
            }
        }
        
        System.out.println(Arrays.deepToString(IntArr).replace("], ", "]\n"));
    }
    
    public int getX(){
        int i = FelderX * Feldbreite + 6;
        //                           + 6 = 6 (gesamt 406)
        return i;
    }
    
    public int getY(){
        int i = FelderY * Feldbreite + FontSize + 15 + 28;
        //                                 25   + 15 + 28 = 68 (gesamt 468)
        return i;
    }
    
    public int getFontSize(){
        return FontSize;
    }
}
