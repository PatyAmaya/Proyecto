import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends World implements ScoreManager
{
    public Level1()
    {    
        super(600, 400, 1); 
        prepare();
        this.addObject(new Frog(this),78, 330);
    }
    
    private void prepare(){
        addObject(new Large(), 210, 422);
        addObject(new Floating(), 526,212);
        addObject(new Cookie(), 220,345);
        addObject(new Cookie(), 280,345);
        addObject(new Cookie(), 340,345);
        addObject(new Cookie(), 400,345);
        addObject(new Cookie(), 460,345);
        addObject(new Short(),117,137);
        Flag flag = new Flag();
        addObject(flag,97,65);
        addObject(new Star(),395,142);
        addObject(new Star(),465,142);
        addObject(new Star(),535,142);
    }
    
    public void updateScore(int score){
        this.showText("Puntaje "+score, 532, 35);
    }
    
    public void nextWorld(){
        Greenfoot.setWorld(new Level2());
    }
}
