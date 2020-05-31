package algorithm.search;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchHelperTest {

    @Test
    public void linearSearch() {
        int[] lookupArray = {23, 42, 6, 5, 78, 89, 10};
        Assert.assertEquals(0, LinearSearchHelper.linearSearch(lookupArray, 23));
    }

    @Test
    public void linearSearch2() {
        int[] lookupArray = {23, 42, 6, 5, 78, 89, 10};
        Assert.assertEquals(6, LinearSearchHelper.linearSearch(lookupArray, 10));
    }

    @Test
    public void linearSearch3() {
        int[] lookupArray = {23, 42, 6, 5, 78, 89, 10};
        Assert.assertEquals(3, LinearSearchHelper.linearSearch(lookupArray, 5));
    }

    @Test
    public void linearSearch4() {
        int[] lookupArray = {23, 42, 6, 5, 78, 89, 10};
        Assert.assertEquals(-1, LinearSearchHelper.linearSearch(lookupArray, 11));
    }
}
