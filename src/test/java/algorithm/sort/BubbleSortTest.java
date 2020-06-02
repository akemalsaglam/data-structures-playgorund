package algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] array = {23, 42, 6, 5, 78, 89, 10};
        Assert.assertArrayEquals(new int[]{5, 6, 10, 23, 42, 78, 89}, BubbleSort.sort(array));
    }

}
