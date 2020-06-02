package algorithm.sort;

import algorithm.search.LinearSearchHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void sort() {
        int[] array = {23, 42, 6, 5, 78, 89, 10};
        Assert.assertArrayEquals(new int[]{5, 6, 10, 23, 42, 78, 89}, InsertionSort.sort(array));
    }

}
