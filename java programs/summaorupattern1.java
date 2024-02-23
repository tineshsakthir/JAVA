import java.util.Scanner;
public class summaorupattern1 {
  public int[][] matrix (){
    Scanner scanner  = new Scanner(System.in);
    System.out.print("Enter the number of dimensions : ");
    int noOfDimensions = scanner.nextInt();
    int newMatrixDimension = noOfDimensions*2-1;
    int [][] matrix = new int[newMatrixDimension][newMatrixDimension];
    if(noOfDimensions <1){
      System.err.println("Invalid input");
    }
    if(noOfDimensions == 1){
      matrix[0][0] = 1;
      scanner.close();
      return matrix;
     }
    int [] arr = {0,newMatrixDimension};
    while(noOfDimensions>1){
      for(int i=arr[0];i<=arr[0];i++){
        for(int j=arr[1]-1;j>=arr[0];j--){
          matrix[i][j] = noOfDimensions;
        }
      }
      for(int i=arr[1]-1;i>=arr[0]+1;i--){
        for(int j=arr[0];j<=arr[0];j++){
          
          matrix[i][j] = noOfDimensions;
        }
      }
      for(int i=arr[1]-1;i<=arr[1]-1;i++){
        for(int j=arr[0]+1;j<=arr[1]-1;j++){
          
          matrix[i][j] = noOfDimensions;
        }
      }
      for(int i = arr[0]+1;i<=arr[1]-2;i++){
        for(int j = arr[1]-1;j<=arr[1]-1 ; j++){
          matrix[i][j] = noOfDimensions;
        }
      }
      noOfDimensions--;
      arr[0]++;
      arr[1]--;
    }
    int mid = newMatrixDimension/2 ; 
    matrix[mid][mid] = 1;  
    scanner.close();
   return matrix;
  } 
  public static void main(String [] argv){
    summaorupattern1 obj = new summaorupattern1();
    int [][] matrix = obj.matrix();
    System.out.println("The matrix is");
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix.length;j++){
        System.out.print(" "+matrix[i][j]);
      }
      System.out.println();
    }
  }
}
