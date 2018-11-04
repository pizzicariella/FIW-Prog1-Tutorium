import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die Klasse Kara implementiert Methoden, die Kara ausführen kann
 * @author : IhrName 
 */
public class MyKara extends Kara
{
    public void act() 
    {
        calculate();
    }
    
    public void calculate(){
        int counter=0;
        while(!treeLeft()){
            while(!treeFront()){
                move();
                if(onLeaf()){
                    counter++;
                }
            }
            turn();
            move();
            move();
            if(counter == 1 || counter == 3){
                putLeaf();
                if(counter == 3){
                    counter = 1;
                }
                else{
                    counter = 0;
                }
            }
            else{
                counter = 1;
            }
                turnRight();
                move();
                turnRight();
        }
        if(counter == 1){
            putLeaf();
        }
    }
    
    public void turn(){
        turnLeft();
        turnLeft();
    }
}
