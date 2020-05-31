package algorithm.search;

/**
 * Interpolation search is an improved variant of binary search.
 * This search algorithm works on the probing position of the required value.
 * For this algorithm to work properly, the data collection should be in a sorted form and equally distributed.
 * <p>
 * Binary search has a huge advantage of time complexity over linear search.
 * Linear search has worst-case complexity of Ο(n) whereas binary search has Ο(log n).
 * Runtime complexity of interpolation search algorithm is Ο(log (log n)) as compared to Ο(log n) of BST in favorable situations.
 * <p>
 * There are cases where the location of target data may be known in advance.
 * For example, in case of a telephone directory, if we want to search the telephone number of Morphius.
 * Here, linear search and even binary search will seem slow as we can directly jump to memory
 * space where the names start from 'M' are stored.
 * https://www.tutorialspoint.com/data_structures_algorithms/interpolation_search_algorithm.htm
 */
public class InterpolationSearchHelper {

    public static int interpolationSearch(int[] sortedLookupArray, int searchValue) {
        return search(sortedLookupArray, searchValue);
    }

    private static int search(int[] sortedLookupArray, int searchValue) {
        int lowerBound = 0;
        int upperBound = sortedLookupArray.length - 1;

        while (upperBound >= lowerBound
                && searchValue >= sortedLookupArray[lowerBound]
                && searchValue <= sortedLookupArray[upperBound]) {

            if (lowerBound == upperBound) {
                if (sortedLookupArray[lowerBound] == searchValue) {
                    return lowerBound;
                } else {
                    return -1;
                }
            }

            int position = (int) (lowerBound
                                + (((double)(upperBound - lowerBound) / (double)(sortedLookupArray[upperBound] - sortedLookupArray[lowerBound]))
                                * (searchValue - sortedLookupArray[lowerBound])));

            if (sortedLookupArray[position] == searchValue) {
                return position;
            } else if (sortedLookupArray[position] > searchValue) {
                upperBound = position - 1;
            } else if (sortedLookupArray[position] < searchValue) {
                lowerBound = position + 1;
            }
        }
        return -1;
    }
}
