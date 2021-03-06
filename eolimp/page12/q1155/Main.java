package page12.q1155;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  static ArrayList<Integer> res = new ArrayList<Integer>();
  static int x, y, d;

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int a, b;
    while(in.hasNextInt()) {
      a = in.nextInt();
      b = in.nextInt();
      f(a,b);

      res.add(x);
      res.add(y);
      res.add(d);
    }

    for(int i=0; i<res.size(); i+=3) {
      System.out.println(res.get(i) + " " + res.get(i+1) + " " + res.get(i+2));
    }
  }

  private static void f(int a, int b) {
    if(b == 0) {
      d = a; x = 1; y = 0;
      return;
    }
    f(b, a%b);
    int s = y;
    y = x - (a/b) * y;
    x = s;
  }

}