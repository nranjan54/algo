package page66.q6574;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    Pattern p = Pattern.compile("[A-F]?A+F+C+[A-F]?");

    while(t-- > 0) {
      System.out.println(p.matcher(in.next()).matches() ? "Infected!" : "Good");
    }
  }
}
