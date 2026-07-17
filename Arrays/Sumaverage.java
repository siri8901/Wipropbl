import java.util.Scanner;
class Sumaverage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        int average=0;
             for (int i=0;i<n;i++){
            sum = sum + a[i];
             }
            average=sum/n;
        System.out.println(sum);
        System.out.println(average);
        }
    }