import java.util.Scanner;
public class fisrt {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the value of A : ");
  int a = scanner.nextInt();
  System.out.println("Enter the value of B : ");
  int b = scanner.nextInt();
  System.out.println("Enter the value of C : ");
  int c = scanner.nextInt();
  System.out.println("The sum will be " + (a+ b+ c));
  scanner.close();
}
}
