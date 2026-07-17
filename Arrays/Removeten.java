import java.util.Scanner;
import java.util.Arrays; 
class Removeten {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int temp[] = new int[n]; 
        int start = 0;
        int end = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (a[i] == 10) {
                temp[end] = 10;
                end--;
            } else {
                temp[start] = a[i];
                start++;
            }
        } 
        a = temp; 
        System.out.println("Result: " + Arrays.toString(a)); 
    }
}
