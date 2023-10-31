package java_dsa;

import java.util.Scanner;



    class  Array{
        Scanner n =new Scanner(System.in);
        int arr1 []=new int[5];
        public void arrayInput(){
            for(int i=0;i<arr1.length;i++){
                arr1[i]=n.nextInt();

            }
        }
        public void printArray(){
            for(int i=0;i<arr1.length;i++){
                System.out.print(arr1[i]+" ");

            }
        }

        public void changArray(){
            for()

        }
    }

    public class  array_2 {

        public static void main(String[] args) {
            System.out.println("hi");
            Scanner n =new Scanner(System.in);
            Array m=new Array();
            m.arrayInput();
            m.printArray();

        }

    }

