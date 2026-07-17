import java.util.Scanner;
import java.util.Arrays;
class Reverse2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.println("Enter the elements (4 numbers):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int temp;
        temp = a[0][0];
        a[0][0] = a[1][1];
        a[1][1] = temp;
        temp = a[0][1];
        a[0][1] = a[1][0];
        a[1][0] = temp;
        System.out.println("Reversed Matrix: " + Arrays.deepToString(a));
    }
}