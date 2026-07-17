import java.util.Scanner;
class Sumbetween {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }        
        int sum = 0;
        boolean ignore = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == 6) {
                ignore = true; 
            }
            if (!ignore) {
                sum += a[i]; 
            } 
            if (ignore && a[i] == 7) {
                ignore = false; 
            }
        }
        System.out.println("Output: " + sum);
        sc.close();
    }
}
