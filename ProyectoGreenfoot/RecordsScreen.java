import greenfoot.*; 
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class RecordsScreen extends World
{
    public RecordsScreen()
    {    
        super(600, 400, 1); 
        showScore();
        prepare();
    }

    public void showScore(){
        int y = 150;
        RecordManager recordManager = new RecordManager(5, "records.txt");
        List<Record> records = recordManager.getRecords();
        
        for(Record record : records){
            
            GreenfootImage showText = getBackground();
            Font adjustedFont = new Font(null,true, false, 30);
            showText.setColor(Color.BLACK);
            showText.setFont(adjustedFont);
            showText.drawString(record.getPlayer()+" - "+record.getScore(),140,y);
            y+=52;
        }
    }
    
    /*
    public void showScore(){
        int y = 100;
        String nameAndScore;

        try{
            File file = new File("records.txt");    
            Scanner entry = new Scanner(new FileReader(file));

            while(entry.hasNext()){
                nameAndScore = entry.next();
                GreenfootImage showText = getBackground();
                Font adjustedFont = new Font(null,true, false, 30);

                showText.setColor(Color.BLACK);
                showText.setFont(adjustedFont);
                showText.drawString(nameAndScore, 140, y+=52);
            }
        }catch(IOException e){

        }
    }*/
    private void prepare()
    {
        HomeButton homeButton = new HomeButton();
        addObject(homeButton,564,366);
    }
}
