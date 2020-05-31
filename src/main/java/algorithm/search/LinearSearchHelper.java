package algorithm.search;

/**
 * Linear search is a very simple search algorithm with run-time complexity of Ο(n).
 * In this type of search, a sequential search is made over all items one by one.
 * Every item is checked and if a match is found then that particular item is returned,
 * otherwise the search continues till the end of the data collection.
 * https://www.tutorialspoint.com/data_structures_algorithms/linear_search_algorithm.htm
 */
public class LinearSearchHelper {

    public static int linearSearch(int[] sortedLookupArray, int searchValue) {
        int index = -1;
        for (int i = 0; i < sortedLookupArray.length; i++) {
            if (searchValue == sortedLookupArray[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
