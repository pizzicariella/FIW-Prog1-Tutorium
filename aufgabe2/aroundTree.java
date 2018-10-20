import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die Klasse Kara implementiert Methoden, die Kara ausführen kann
 * @author : Joern Freiheit 
 */
public class MyKara extends Kara
{
    /**
     * Bei Druecken des Knopfes '>Act' wird die Methode act() aufgerufen
     */
    public void act() 
    {
        putLeaf();
        turnLeft();
        move();
        while(!onLeaf())
        {
            while(treeFront())
            {
                if(treeRight()){
                    turnLeft();
                }
                else{
                    turnRight();
                    move();
                }
                /*if(!treeFront()){
                    move();
                }*/
            }
            while(!treeFront() && !onLeaf())
            {
                if(treeRight())
                {
                    move();
                }
                else
                {
                    turnRight();
                    move();
                }
            }
        }
    }
}
