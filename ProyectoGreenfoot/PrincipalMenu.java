import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PrincipalMenu extends World
{

    public PrincipalMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        
        addObject(new PlayButton(), 300, 200);
        addObject(new RecordsButton(), 300, 293);
        addObject(new HowToPlayButton(), 300, 364);

    }
    
    private void selectOption(){
        if(Greenfoot.mouseClicked(PlayButton.class)==true){
            //Greenfoot.setWorld(new FirstLevel());
        }
        if(Greenfoot.mouseClicked(RecordsButton.class)==true){
            //Greenfoot.setWorld(new Records_Screen());
        }
        if(Greenfoot.mouseClicked(HowToPlayButton.class)==true){
            //Greenfoot.setWorld(new HowToPlay_Screen());
        }
    }
}
