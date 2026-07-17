import java.util.Scanner;
class Largesmall{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elemnents:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int large=a[0];
       int small=a[0];
       for(int i=0;i<n;i++){
        if(a[i]>large){
            large=a[i];
        }
        if(a[i]<small){
            small=a[i];
        }
       }
       System.out.println("Largest element is:"+large);
       System.out.println("Smallest element is:"+small);
       sc.close();
    }
}