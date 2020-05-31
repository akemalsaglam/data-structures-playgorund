package algorithm.search;

/**
 * Binary search is a fast search algorithm with run-time complexity of Ο(log n).
 * This search algorithm works on the principle of divide and conquer.
 * For this algorithm to work properly, the data collection should be in the sorted form.
 * <p>
 * Binary search looks for a particular item by comparing the middle most item of the collection.
 * If a match occurs, then the index of item is returned.
 * If the middle item is greater than the item, then the item is searched in the sub-array
 * to the left of the middle item.
 * Otherwise, the item is searched for in the sub-array to the right of the middle item.
 * This process continues on the sub-array as well until the size of the subarray reduces to zero.
 * https://www.tutorialspoint.com/data_structures_algorithms/binary_search_algorithm.htm
 */
public class BinarySearchHelper {

    public static int binarySearch(int[] sortedLookupArray, int searchValue) {
        return search(sortedLookupArray, 0, sortedLookupArray.length - 1, searchValue);
    }

    private static int search(int[] sortedLookupArray, int lowerBound, int upperBound, int searchValue) {
        if (upperBound >= lowerBound) {
            int middle = lowerBound + (upperBound - lowerBound) / 2;
            if (sortedLookupArray[middle] == searchValue) {
                return middle;
            } else if (sortedLookupArray[middle] > searchValue) {
                return search(sortedLookupArray, lowerBound, middle - 1, searchValue);
            } else if (sortedLookupArray[middle] < searchValue) {
                return search(sortedLookupArray, middle + 1, upperBound, searchValue);
            }
        }
        return -1;
    }
}
