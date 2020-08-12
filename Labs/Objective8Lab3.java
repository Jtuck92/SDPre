public class Objective8Lab3 {
  public static void main(String[] args) {

    int num = 0;

    for(num = 1; num <= 20; num++){
      if(num % 2 != 0){
        System.out.println(num + " is odd");
      }
      if(num % 2 == 0){
        System.out.println(num + " is even");
      }
    }
  }
}
