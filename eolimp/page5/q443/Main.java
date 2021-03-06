package page5.q443;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt(), k = in.nextInt();

    ArrayList<Integer> icqs=new ArrayList<Integer>();
    ArrayList<String> names=new ArrayList<String>();

    String name;
    int icq, i,j;
    for(i=0; i<n; i++) {

      name = in.next();
      icq = in.nextInt();
      for(j=0; j<icqs.size(); j++) {

        if(icq < icqs.get(j)) {
          icqs.add(j, icq);
          names.add(j, name);
          break;
        }
      }

      if(j == icqs.size()) {
        names.add(name);
        icqs.add(icq);
      }
    }

    String[] s = new String[k];
    for(i=0; i<k; i++)
      s[i]=names.get(i);
    Arrays.sort(s);

    for(String ss : s)
      System.out.println(ss);
  }

}