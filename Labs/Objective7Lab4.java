public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter = 0;
    int sum = 0;

    while(counter <= 20) {
    counter = counter + 1;
    if(counter <= 20) {
      sum = sum + counter;
    }
    if(counter == 20) {
    System.out.println(sum);
    }
    }
  }
}
