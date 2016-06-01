package lab3;

/**
 * A class for rectangular arrays full of random
 * positive integers.
 */
import java.util.Random; //For the random number generator

public class RandomArray {
  
  //An object that will provide the random numbers
  static Random randomGenerator = new Random();
  
  //An instance variable to hold an array of integers
  //****YOUR CODE HERE****
  int[][] array;
  
  public RandomArray(int rows, int cols, int range) { 
    /* Construct a random array with the given number of
     * rows and columns   filled with random integers in 
     * the range  0..range-1 */
    //****YOUR CODE HERE****
    array = new int[rows][cols];
    for (int i = 0; i< array.length; i++){
      for(int j = 0; j< array[i].length; j++){
        array[i][j] = randomGenerator.nextInt(range-1);
      }
    }
  }//constructor

  public int [] getRow(int r){
    //Return a copy (clone) of row r of the array
    //****YOUR CODE HERE****
    int [] result = new int[array[r].length];
    System.arraycopy(array[r],0,result,0,array[r].length);
    return result; //DUMMY - REMOVE
  }//getRow method
  
  public int[] getCol(int c){
    //Return an int[] array containing the numbers from column c.
    //****YOUR CODE HERE****
    int [] result = new int[array.length];
    for(int i = 0;i< array.length;i++){
      result[i] = array[i][c];
    }
    return result; //DUMMY - REMOVE
  }//getCol method

}//RandomArray class

