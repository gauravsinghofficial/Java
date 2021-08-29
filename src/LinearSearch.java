import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println(search + "is present at location" + (i + 1) + ".");
                break;
            }
        }
        if (i == n) {
            System.out.println(search + "is not present");
        }
    }
}
