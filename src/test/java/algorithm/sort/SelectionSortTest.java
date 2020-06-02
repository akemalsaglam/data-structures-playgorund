package algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void sort() {
        int[] array = {23, 21, 22, 5, 78, 89, 10};
        Assert.assertArrayEquals(new int[]{5, 10, 21, 22, 23, 78, 89}, SelectionSort.sort(array));
    }

}
