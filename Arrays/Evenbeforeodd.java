import java.util.Scanner;
import java.util.Arrays;
class Evenbeforeodd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int temp[]=new int[n];
        int start=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                temp[start]=a[i];
                start++;
            }else{
                temp[end]=a[i];
                end--;
            }
        }
        a=temp;
            System.out.println(Arrays.toString(a));
    }
}