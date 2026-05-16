public class SelectionSort {

    public static void selectionSort(int[] arr) {

        // 5 3 2 1 9
        
        for (int i = 0; i < arr.length; i++) {
            //find smallest 
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
    
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }


        for(int e : arr) {
            System.out.print(e + " ");
        }
    }
    public static void main(String[] args) {
        
        int [] arr = {5, 3, 2, 1, 9};

        selectionSort(arr);
    }
}
