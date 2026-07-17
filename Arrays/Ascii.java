import java.util.Scanner;
class Ascii{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The character is:");
        for(int i=0;i<n;i++){
            System.out.print((char)(a[i]));
        }
        System.out.println();
        sc.close();
    }

    }
