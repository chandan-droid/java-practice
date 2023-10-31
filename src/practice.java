import java.util.Scanner;
public class practice {

    public static void main(String[] args) {
    Scanner mark = new Scanner(System.in);
        System.out.println("enter any website url");
        String web= mark.next();
    if(web.endsWith(".org")){
        System.out.println("organization website");
    } else if (web.endsWith(".com")) {
        System.out.println(" commercial website");
    }else{
        System.out.println("indian");
    }
    }
}
