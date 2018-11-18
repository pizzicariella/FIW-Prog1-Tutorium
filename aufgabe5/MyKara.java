

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
        for(int i=0; i<rows; i++){
            move();
        }
        for(int row=0; row<rows; row++){
            for(int j=0; j<row*2+1; j++){
                putLeaf();
                move();
            }
            turnRight();
            move();
            turnRight();
            for(int k = 0; k<=row*2+1; k++){
                 move();
            }
            turnRight();
            turnRight();
        }
    }
    /* Hier eine alternative Lösung ohne zurücklaufen:
    
    public void drawPyramid(int rows){
      for(int i = 0; i<rows; i++){
          move();
      }
      for(int row=0; row<rows; row++){
          for(int i = 0; i<2*row+1;i++){
              putLeaf();
              move();
          }
          if(row%2 == 0){
              turnRight();
              move();
              turnRight();
          }
          else{
              turnLeft();
              move();
              turnLeft();
          }
      }
    }*/
}
