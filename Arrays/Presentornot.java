import java.util.Scanner;
class Presentornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int ele = sc.nextInt();
        int foundIndex = -1;
        for(int i = 0; i < n; i++) {
            if(a[i] == ele) {
                foundIndex = i; 
                break;          
            }
        }
        System.out.println(foundIndex);
        sc.close();
    }
}
