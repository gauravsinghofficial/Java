public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        int len = arr.length;
        int avg = count / len;
        System.out.println("Average is " + avg);
    }
}
