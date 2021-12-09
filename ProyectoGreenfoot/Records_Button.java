import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Records_Button extends Button
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this)){
            this.getImage().setTransparency(100);
        } else{
            this.getImage().setTransparency(255);
        }
    }
}
