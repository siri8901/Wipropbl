import java.util.Scanner;
import java.util.Arrays;
class Middle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        System.out.println("Enter the elements:");
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
            for(int i=0;i<3;i++){
            b[i]=sc.nextInt();
            }
        int temp[]=new int[2];
        temp[0]=a[1];
        temp[1]=b[1];

        System.out.println("Result: " + Arrays.toString(temp));      
        
    }


}