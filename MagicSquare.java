

/**
 * A class that will generate magic squares of
 * odd order using de la Loubere's algorithm.
 */
public class MagicSquare {
  
  //An array to hold the magic square
  //***YOUR CODE HERE***
  int [][]array;
  
  public MagicSquare(int n) { 
    
    /* Cnnstruct a magic square of order n
     * (n rows and columns containing numbers
     * from 1 to n*n).
     */
    //***YOUR CODE HERE***
    array = new int[n][n];
    int row = n-1;
    int col = n/2;
    array[row][col] = 1;
    for (int i = 1; i<= n*n-1;i++){
      if(i%n ==0){
        row--;
      }
      if (i%n !=0){
        row++;
        col++;
      }
      if (row>n-1){
        row = row-n;
      }
//      if(row<0){
//        row = n + row;
//      }
      if (col>n-1){
        col = col-n;
      }
//      if(col<0){
//        col = n + col;
//      }
      array[row][col] = i+1;
    }
    
  }//constructor
  
  public String toString(){
    /* Return a String allowing the square to be
     * printed. Rows are separated by \n and columns
     * are separated by \t characters.
     */
    //***YOUR CODE HERE***
 String result ="";
 for (int i  = 0;i < array.length;i++){
  for (int j = 0;j<array[i].length;j++){
   result += " "+array[i][j];
  }
  result += "\n";
  
 }
    
    return result; //DUMMY - REMOVE
  }//toString
  
}//MagicSquare class
