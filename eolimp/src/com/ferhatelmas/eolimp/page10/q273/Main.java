package com.ferhatelmas.eolimp.page10.q273;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger a = new BigInteger(in.next()),
               b = new BigInteger(in.next()),
               m = new BigInteger(in.next());

    System.out.println(a.modPow(b, m));
  }
}
