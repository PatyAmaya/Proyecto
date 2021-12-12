import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private boolean mouseOver=false;
    
    public void mouseOverButton()
    {
        if(Greenfoot.mouseMoved(null)){
            mouseOver=Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver){
            this.getImage().setTransparency(100);
        } else{
            this.getImage().setTransparency(255);
        }
    }
    
    public void checkClick(World world){
        mouseOverButton();
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
}