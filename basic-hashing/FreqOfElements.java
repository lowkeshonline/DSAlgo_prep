import java.util.ArrayList;

public class FreqOfElements {

    public static ArrayList<Integer> countFrequencyOfListElements(int[] arr) { 
        ArrayList<Integer> hash = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            hash.add(0);
        }

        for(int i = 0; i < arr.length; i++) {
            hash.set(arr[i], hash.get(arr[i]) + 1);
        }

        return hash;
    }


    public static int[] countFrequencyOfElements(int[] arr) { 
        int[] hash = new int[16];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        return hash;
    }
    public static void main(String[] args) {
        
        int [] arr = {10,5,10,15,10,5};

        int[] res = countFrequencyOfElements(arr);
        ArrayList<Integer> res2 = countFrequencyOfListElements(arr);

        System.out.println("Using Array \n");
        for(int i = 0; i < res.length; i++) { 
            System.out.print(" [ " + i + "," + res[i] + " ] " );
        }

        System.out.println("\nUsing ArrayList");

        for (int i = 0; i < res2.size(); i++) {
            System.out.print(" [ " + i + "," + res2.get(i) + " ] " );
        }
    }
}
