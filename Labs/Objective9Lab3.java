import java.util.Scanner;
public class Objective9Lab3{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int selection;

    printMenu();

    while(true){
      selection = scanner.nextInt();
      if(selection == 1){
        System.out.println("Hi there!");
        }
      if(selection == 2){
        System.out.println("I like ramen and pizza mostly.");
        }
      if(selection == 3){
        System.out.println("See ya!");
        break;
        }
}
      scanner.close();
}
  public static void printMenu(){
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My Favorite Foods");
    System.out.println("3: Exit");
    System.out.println();
    }
}
