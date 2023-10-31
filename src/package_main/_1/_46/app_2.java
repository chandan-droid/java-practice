package package_main._1._46;
import package_main._1.*;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;
import static package_main._1._46.child.r1;
import static package_main._1.demo.m1;
class child extends demo{
    int a;
    static void r1(int v){
        System.out.println(v);
    }
}
public class app_2 {
    public static void main(String[] args) {
        int x=16;
        int y=46;
       m1(x);
        System.out.println(max(x,y));
        r1(x);
           }
}
