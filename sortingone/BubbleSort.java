public class BubbleSort {

    // 1,3,4,2,5

    public static void bubbleSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) { 
            boolean swapped = false;

            for(int j = 0; j < arr.length - i; j++) { 
                if (arr[j] < arr[j+1]) { 
                    int temp = arr[j + 1]; 
                    arr[j + 1] = arr[j]; 
                    arr[j] = temp; 
                    swapped = true;
                }
            }

            if (!swapped) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = { 3, 1, 5, 4, 2};

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
