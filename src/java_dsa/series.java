package java_dsa;
import java.lang.Math;

public class series {
    public static void main(String[] args) {

                double j=0,k=1;
                for(double i=1;i<=10;i++){
                    double base=i+j;
                    System.out.print(Math.pow(base,k));
                    if(i==10)
                        continue;
                    System.out.print("+");
                    k++;
                    j++;
                }
    }
}
