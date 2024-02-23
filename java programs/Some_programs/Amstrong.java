import java.util.Scanner;

public class Amstrong {
    public static void main(String [] agrs){
      Scanner scanner =  new Scanner(System.in);
      System.out.print("Please Enter A Number : ");
      int number = scanner.nextInt();
      int computingNumber = number;
    // Integer.toString(Number).length();
     int sum = 0;
     int upto = Integer.toString(number).length();
      for(int i=0;i<upto;i++){
        // sum += (Number%10)*upto;
       sum += Math.pow(computingNumber%10,upto);
       computingNumber = computingNumber /10;
      }

    if(sum == number){
      System.out.println("The given number is an amstrong number !!!");
    }
    else{
      System.out.println("The given number is not an amstrong number !!!");
    }

      scanner.close();
    }
  
}
