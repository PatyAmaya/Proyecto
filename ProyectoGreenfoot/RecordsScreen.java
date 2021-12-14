import greenfoot.*; 
import java.io.*;
import greenfoot.*;
import java.io.IOException;
import java.util.Scanner;

public class RecordsScreen extends World
{
    public RecordsScreen()
    {    
        super(600, 400, 1); 
        showScore();
    }
    
    public void showScore(){
        int y = 150;
        String nameAndScore;
        
        try{
            File file = new File("RecordFile.txt");    
            Scanner entry = new Scanner(new FileReader(file));
    
            do{
                nameAndScore = entry.next();
                GreenfootImage showText = getBackground();
                Font adjustedFont = new Font(null,true, false, 30);
                
                
                showText.setColor(Color.BLACK);
                showText.setFont(adjustedFont);
                showText.drawString(nameAndScore, 200, y+=40);
            }while(entry.hasNext());
        }catch(IOException e){
          
        }
    }
}
