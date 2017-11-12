

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
        drawPyramid(11);
    }
    public void drawPyramid(int rows){
        for(int i=1; i<rows; i++){
            move();
        }
        putLeaf();
        turnRight();
        move();
        turnRight();
        move();
        turnRight();
        turnRight();
        for(int i=1; i<rows; i++){
            for(int j=0; j<i*2+1; j++){
                putLeaf();
                move();
            }
            turnRight();
            move();
            turnRight();
            for(int k = 0; k<=i*2+1; k++){
                 move();
            }
            turnRight();
            turnRight();
        }
    }

}
