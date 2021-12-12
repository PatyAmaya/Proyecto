import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HomeButton extends Button
{
    public void act()
    {
        mouseOverButton();
        checkClick(new PrincipalMenu());
    }
}
