import java.util.Scanner;
import java.util.Arrays;
class Sortedorder { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the number of elements:"); 
        int n = sc.nextInt(); 
        int a[] = new int[n]; 
        System.out.println("Enter the values:"); 
        for(int i = 0; i < n; i++) { 
            a[i] = sc.nextInt(); 
        } 
        Arrays.sort(a); 
        System.out.println("The sorted values:"); 
        for(int i = 0; i < n; i++) { 
            System.out.println(a[i]); 
        } 
    } 
}
