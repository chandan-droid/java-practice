
class dem{
    int a;
    int b;

    dem(int m,int n){
        System.out.println("hello");
        a=m;
        b=n;
    }
    int sum(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }
}
public class parameterised_constructor {
    public static void main(String[] args) {
        dem o1=new dem(5,7);
        System.out.println(o1.sum());
        System.out.println(o1.div());


        dem o2= new dem(8,10);
        System.out.println(o2.mul());
        System.out.println(o2.sub());
    }
}
