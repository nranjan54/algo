package com.ferhatelmas.eolimp.page115.q3043;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    for(int i=1, t=in.nextInt(); i<=t; i++) {
      int n = in.nextInt();
      int[] ns = new int[n];
      for(int j=0; j<n; j++) ns[j] = in.nextInt();
      stat(ns, i);
    }
  }

  private static void stat(int[] ns, int k) {
    Arrays.sort(ns);

    int max = 0, min = 100, diff = 0;
    for(int i=0; i<ns.length; i++) {
      max = Math.max(ns[i], max);
      min = Math.min(ns[i], min);
      if(i < ns.length-1)
        diff = Math.max(Math.abs(ns[i] - ns[i+1]), diff);
    }

    System.out.println("Class " + k);
    System.out.println("Max " + max + ", Min " + min + ", Largest gap " + diff);
  }
}
