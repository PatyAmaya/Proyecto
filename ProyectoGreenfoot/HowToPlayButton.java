import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HowToPlayButton extends Button
{
    public void act()
    {
        mouseOverButton();
        checkClick(new HowToPlayScreen());
    }
}
