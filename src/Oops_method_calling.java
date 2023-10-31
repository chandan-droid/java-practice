import java.util.Scanner;
class demo{
    demo(){
        System.out.println("hello");
    }
   int sum(int a, int b){
       int ans=a+b;
       System.out.println(ans);

       return ans;
   }
}
public class Oops_method_calling {
    public static void main(String[] args) {
        demo s=new demo();
        System.out.println("please enter 2 numbers");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        s.sum(x,y);



    }
}
