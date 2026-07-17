import java.util.Scanner;
import java.util.Arrays;
class Oneandfour{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean valid=true;
        for(int i=0;i<n;i++){
            if(a[i]==1||a[i]==4){
            }else{
                valid=false;
            }
        }
        if(valid){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
