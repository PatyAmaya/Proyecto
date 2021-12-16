import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PrincipalMenu extends World
{

    public PrincipalMenu()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        addObject(new PlayButton(), 300, 200);
        addObject(new RecordsButton(), 300, 293);
        addObject(new HowToPlayButton(), 300, 364);

    }
    
}
