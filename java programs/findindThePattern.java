import java.util.Scanner;
public class findindThePattern {
  public static void main(String [] args){
   Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the string for checking : ");
    String word = scanner.nextLine();
    int len = word.length();
     int i=0,mid=len/2;
   Boolean flag = false;
    if(len%2 == 0){
     for(int k = 0;k<len/2;k++){
        if(word.charAt(i++) == word.charAt(mid++)){
          continue;
        }
        else{
            flag = true;
            break;
        }
      }
    }
    else{
      mid = mid+1;
      for(int k = 0;k<len/2;k++){
        if(word.charAt(i++) == word.charAt(mid++)){
          continue;
        }
        else{
            flag = true;
            break;
        }
    }
  }
  String result = !flag? "The given string in good " : "The given string is bad ";
  System.out.println(result);
  scanner.close();
}
}