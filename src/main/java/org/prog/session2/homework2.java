package org.prog.session2;

import java.util.Random;

public class homework2 {

    public static void main(String[] args) {
        Random random = new Random();
        for (int l = 1; l <= 1000; l++ ) {

            int i = random.nextInt(1000);
            int j = random.nextInt(1000);
            System.out.println(i);
            if ((i - j) % 7 == 0) {
                System.out.println("STOP:(i - j) % 7 == 0");
                break;
            }
        }
      }
}