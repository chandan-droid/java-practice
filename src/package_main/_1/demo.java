package package_main._1;

import java.util.Scanner;

import static package_main._1.demo.m1;

public class demo{
    public static void m1(int x){
        if(x>3){
            System.out.println("Hey, congratulations.");
        }else System.out.println("better luck next time.");
    }
}
 class app_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your score here");
        int sco = input.nextInt();
        m1(sco);
        int kco = input.nextInt();
        m1(kco);

    }
}
