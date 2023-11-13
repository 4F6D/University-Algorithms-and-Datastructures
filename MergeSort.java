public class MergeSort {

    private static void mergeSort(int[] array) {
        // Cache length of array
        int length = array.length;
        if(length <= 1) return;     // Base case

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i = 0;  // Left array
        int j = 0;  // Right array

        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;    // indices

        // Check the conditions for merging
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {
        int[] testArray = {9,7,8,3,2,1};

        mergeSort(testArray);

        for(int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i] + " ");
        }
    }
}
