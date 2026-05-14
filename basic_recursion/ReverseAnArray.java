public class ReverseAnArray {
    

    public static void main(String[] args) {
        int[] arr = {1,3 , 6, 9, 8, 20};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
