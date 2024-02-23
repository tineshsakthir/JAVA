import java.util.ArrayList;
import java.util.Scanner;
public class pascal_triangle {
  public static void main(String args[]){
    Scanner scanner =  new Scanner(System.in);
    System.out.print("Enter the number of lines : ");
    int numOfLines = scanner.nextInt();;
    int parent [] ={0,1,0};
    ArrayList<Integer> child = new ArrayList<>();
    child.clear();
    for (int i = 0 ; i<numOfLines; i++ ){      
      int parentArrLength = parent.length;
      int spaces = numOfLines - parentArrLength + 2 ;
      if(spaces>=0){
        System.out.print(" ".repeat(spaces));
      }
      for (int ele : parent){
        if (ele!=0 && ele<9){
          System.out.print(" "+ele);
        }
        else if(ele!=0 && ele>9){
          System.out.print(ele);
        }
        else{
          System.out.print(" ");
        }
      }
      for (int k=0;k<parentArrLength-1;k++){
        child.add(parent[k]+parent[k+1]);
      }
      parent = new int[child.size()+2];
      parent[0] = 0;
      for(int l = 1 ; l<child.size()+1;l++){
        parent[l] = child.get(l-1);
      }
      parent[child.size()+1] = 0;
      child.clear();
      System.out.println("");
  }
  scanner.close();
}
}

