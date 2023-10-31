package java_dsa;
class kilo{
    public static void array(){
        int [] ages = new int [4];
        float [] heights = new float [4];
        int no [] = {1,3,5,7,8} ;
        ages[0]=2;
        ages[1]=3;
        ages[2]=5;
        ages[3]=0;

        System.out.println(ages[2 ]);
        System.out.println(ages.length);

    }
    public static void multiarray(){
        int [][] co1 = new int [2][3];
        int [][] co2 ={{2,4},{3,55},{5,1}};
        System.out.println(co1.length);

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(i==0){
                    co1[i][j] =j;
                }else{co1[i][j] =j+co1.length;}
                System.out.println(co1[i][j]);
            }
        }

    }

}
public class array_introduction {
    public static void main(String[] args) {
        kilo f=new kilo();
//        f.array();
        f.multiarray();
    }

}
