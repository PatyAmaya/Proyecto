import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World implements ScoreManager
{

    public Level2()
    {    
        super(600, 400, 1); 
        prepare();
        this.addObject(new Frog(this),78, 330);
    }
    
    private void prepare()
    {
        Short short1 = new Short();
        addObject(short1, 78, 375);
        Cube cube1 = new Cube();
        addObject(cube1,247,306);
        Cube cube2 = new Cube();
        addObject(cube2,375,236);
        Cube cube3 = new Cube();
        addObject(cube3,512,168);
        addObject(new Star(),95,42);
        addObject(new Star(),165,42);
        addObject(new Star(),235,42);
        Floating floating = new Floating();
        addObject(floating,121,110);
        Cookie cookie = new Cookie();
        addObject(cookie,250,241);
        Cookie cookie2 = new Cookie();
        addObject(cookie2,376,166);
        Flag flag = new Flag();
        addObject(flag,550,93);
    }
    
    public void updateScore(int score){
        this.showText("Puntaje "+score, 532, 35);
    }
    
    public void winMessage(){
        this.showText("Great!",300,200);
    }
    
    public void moveScenaary(){
        
    }
}
