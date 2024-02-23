import java.util.Scanner;

public class Floyd_trinagle {
  public static void main(String [] args){
    Scanner scanner =  new Scanner(System.in);
      System.out.print("Please Enter the Number of lines to print the Floyd's triangle : ");
      int n = scanner.nextInt();
      int k = 1 ;
      int j = 0; 
      for(int i = n ; i> 0 ;i--){
        for (j = 1 ; j< i ; j++){
            System.out.print("");
        }
        for(int m=j; m<=n; m++){
          System.out.print(" "+k);
          k +=1;
        }
        System.out.println("");

      }
      scanner.close();
  }
}
