import java.util.Scanner;
import java.util.Arrays;
class Duplicates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        int a[]=new int[n];
         System.out.println("enter the values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
       System.out.println("Duplicate values:");
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                System.out.println(a[i]+" ");
            }
                    }
                    System.out.println(a[n-1]+" ");
    }
}