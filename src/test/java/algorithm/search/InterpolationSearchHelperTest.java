package algorithm.search;

import org.junit.Assert;
import org.junit.Test;

public class InterpolationSearchHelperTest {

    @Test
    public void interpolationSearch() {
        int[] lookupArray = {2, 4, 5, 6, 9, 12, 13, 15, 34, 45, 50, 67, 68, 80, 100};
        Assert.assertEquals(12, InterpolationSearchHelper.interpolationSearch(lookupArray, 68));
    }

}
