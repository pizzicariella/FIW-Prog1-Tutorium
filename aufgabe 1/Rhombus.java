

/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara:
 * <p>
 * 
 * 
 * <i>MyKara ist eine Unterklasse von Kara. Sie erbt damit alle Methoden der
 * Klasse Kara:</i>
 * <p>
 * 
 * Actions: move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors: onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara {
    
    /**
     * In the 'act()' method you can write your program for Kara <br>
     * <i>In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden</i>
     */
    public void act() {
        drawRhombus();
        
    }
    
    public void drawRhombus(){
        drawDiagonal();
        drawDiagonal();
        drawDiagonal();
        drawDiagonal();
        
        turnLeft();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
    
    public void drawDiagonal(){
        
        putLeaf();
        move();
        turnRight();
        move();
        turnLeft();
        putLeaf();
        move();
        turnRight();
        move();
        turnLeft();
        putLeaf();
        move();
        turnRight();
        move();
        turnLeft();
        putLeaf();
        move();
        turnRight();
        move();
        turnLeft();
        putLeaf();
        
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }

}
