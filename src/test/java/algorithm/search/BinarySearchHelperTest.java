package algorithm.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchHelperTest {

    @Test
    public void binarySearch() {
        int[] sortedLookupArray = {2, 4, 56, 57, 78, 89, 90};
        Assert.assertEquals(3, BinarySearchHelper.binarySearch(sortedLookupArray, 57));
    }

    @Test
    public void binarySearch2() {
        int[] sortedLookupArray = {2, 4, 56, 57, 78, 89, 90};
        Assert.assertEquals(-1, BinarySearchHelper.binarySearch(sortedLookupArray, 58));
    }

    @Test
    public void binarySearch3() {
        int[] sortedLookupArray = {2, 4, 56, 57, 78, 89, 90};
        Assert.assertEquals(0, BinarySearchHelper.binarySearch(sortedLookupArray, 2));
    }

    @Test
    public void binarySearch4() {
        int[] sortedLookupArray = {2, 4, 56, 57, 78, 89, 90};
        Assert.assertEquals(6, BinarySearchHelper.binarySearch(sortedLookupArray, 90));
    }
}
