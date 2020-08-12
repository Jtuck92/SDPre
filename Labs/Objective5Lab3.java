import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
  Scanner kb = new Scanner(System.in);

  System.out.println("Please enter a number: ");
  int userNum = kb.nextInt();
  System.out.println("Please enter a number: ");
  System.out.println(userNum);

  if(userNum > 0) {
    System.out.println("The number greater than zero");
  }
  if (userNum == 0) {
    System.out.println("The numnber is 0");
  }
  else {
    System.out.println("The number is less than zero");
    }
  }
}
