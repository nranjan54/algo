package page63.q6255;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt()%2;

    String a = in.next(), b = in.next();
    for(int i=a.length()-1; i>-1; i--) {
      if(Math.abs(a.charAt(i) - b.charAt(i)) != n) {
        System.out.println("Deletion failed");
        return;
      }
    }
    System.out.println("Deletion succeeded");
  }
}
