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
        addObject(new Play_Button(), 300, 200);
        addObject(new Records_Button(), 300, 293);
        addObject(new HowToPlay_Button(), 300, 364);

    }
    
    private void selectOption(){
        if(Greenfoot.mouseClicked(Play_Button.class)==true){
            //Greenfoot.setWorld(new FirstLevel());
        }
        if(Greenfoot.mouseClicked(Records_Button.class)==true){
            //Greenfoot.setWorld(new Records_Screen());
        }
        if(Greenfoot.mouseClicked(HowToPlay_Button.class)==true){
            //Greenfoot.setWorld(new HowToPlay_Screen());
        }
    }
}
