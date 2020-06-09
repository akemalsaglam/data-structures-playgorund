package algorithm.sort;

public class MergeSort {

    public static int[] sort(int[] array, int arrayLength) {
        if (arrayLength < 2) return new int[0];

        int middle = arrayLength / 2;
        int[] leftPart = new int[middle];
        int[] rightPart = new int[arrayLength - middle];

        for (int i = 0; i < middle; i++) {
            leftPart[i] = array[i];
        }

        for (int j = middle; j < arrayLength; j++) {
            rightPart[j - middle] = array[j];
        }

        sort(leftPart, middle);
        sort(rightPart, arrayLength - middle);
        return merge(array, leftPart, rightPart, middle, arrayLength - middle);
    }

    private static int[] merge(int[] array, int[] leftPart, int[] rightPart, int leftIndex, int rightIndex) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftIndex && j < rightIndex) {
            if (leftPart[i] <= rightPart[j]) {
                array[k++] = leftPart[i++];
            } else {
                array[k++] = rightPart[j++];
            }
        }
        while (i < leftIndex) {
            array[k++] = leftPart[i++];
        }
        while (j < rightIndex) {
            array[k++] = rightPart[j++];
        }
        return array;
    }
}
