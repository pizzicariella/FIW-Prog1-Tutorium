import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die Klasse Kara implementiert Methoden, die Kara ausführen kann
 * @author : IhrName 
 */
public class MyKara extends Kara
{
    public void act() 
    {
        findWayOut();
    }
    
    public void findWayOut(){
      boolean ausgangRechts = true;

      while(!onLeaf()){
          boolean moved = false;
          while(inTunnel() && !treeFront()){
              move();
          }
          if(treeFront() && inTunnel()){
              turn();
              ausgangRechts = false;
          }
          else if(treeRight()){
              turnLeft();
               move();
               move();
               turnLeft();
          }
          else if(treeLeft() && (ausgangRechts == true)){
              turnRight();
               move();
               move();
               turnLeft();
               ausgangRechts = true;
          }
          else if(!treeLeft() && !treeRight()){
                  turnLeft();
                  move();
                  move();
                  turnLeft();
                  ausgangRechts = true;
          }
          else{
              move();
              moved = true;
          }
         
           if(!treeFront() && !onLeaf() && !moved){
              move();
          }
          else if(treeFront()){
              turn();
          }
      }
     
    }
    
    public boolean inTunnel(){
        return treeRight() && treeLeft();
    }
    
    public void turn(){
        turnRight();
        turnRight();
    }
}
