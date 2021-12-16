import greenfoot.*; 
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Frog extends Actor
{
    private static final int OFFSET = 5;
    private int vSpeed = 0;
    private int aceleration = 1;
    
    private String []images;
    
    private int score=0;
    private ScoreManager scoreManager;
    private boolean touchFlag=false;
    private boolean lose=false;
    
    private RecordManager recordManager = new RecordManager(5,"records.txt");
    
    private World actualWorld=getWorld();
    
    Frog(ScoreManager scoreManager){
        images = new String[]{
            "images/Ranita_Down.png",
            "images/Ranita_Up.png"
        };
        this.setImage(images[0]);
        this.scoreManager=scoreManager;
    }
    
    public void act()
    {
        if(!touchFlag&&!lose){
            handleKeys();
            checkFall();
            getItems();
            checkFlag();
            checkLose();
        }else if(touchFlag){
            winCase();
        } else if(lose){
            loseCase();
        }
        
    }
    
    private void handleKeys(){
        int x=getX();
        int y=getY();
        
        if(Greenfoot.isKeyDown("right")){
            setLocation(x+OFFSET,y);
        } if(Greenfoot.isKeyDown("left")){
            setLocation(x-OFFSET,y);
        } if(Greenfoot.isKeyDown("up")){
            jump();
        }
        
    }
    
    private boolean onGround(){
        Actor under = getOneObjectAtOffset(0, OFFSET*7, Platform.class);
        return under!=null;
    }
    
    private void fall(){
        setLocation(getX(), getY()+vSpeed);
        vSpeed = vSpeed + aceleration;
    }
    
    private void checkFall(){
        if(onGround()){
            vSpeed=0;
            setImage(images[0]);
        }else{
            fall();
            setImage(images[1]);
        }
        
    }
    
    public void jump(){
        setImage(images[1]);
        vSpeed=-10;
        fall();        
    }
    
    private void getItems(){
        Item actor = (Item)getOneIntersectingObject(Item.class); 
        
        if(actor!=null){
            score+=actor.getScoreValue();
            
            World world = getWorld();
            
            world.removeObject(actor);
            scoreManager.updateScore(score);
        }
    }
    
    private void checkFlag(){
        if(isTouching(Flag.class)){
            touchFlag=true;
        }
    }
    
    private void checkLose(){
        if(getY()>=370){
            lose=true;
            
        }
    }
    
    private void showWinMessage(){
        //getWorld().showText("Great!",300,200);
        getWorld().addObject(new GreatLabel(), 300, 200);
    }
    
    private void showLoseMessage(){
        getWorld().showText("You Lose!!",300,200);
    }
    
    private void loseCase(){
        showLoseMessage();
        score=0;
        Greenfoot.setWorld(new Level1());
    }
    
    private void winCase(){
        showWinMessage();
        saveScore();
        Greenfoot.setWorld(new Level2(score));
    }
    
    
    private void saveScore(){
        String nombre = JOptionPane.showInputDialog(null, "Player: ");
        Record record = new Record(nombre,score);
        recordManager.save(record);
    }
}
