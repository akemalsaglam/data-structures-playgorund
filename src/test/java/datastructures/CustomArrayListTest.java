package datastructures;

import datastructure.CustomArrayList;
import org.junit.Assert;
import org.junit.Test;

public class CustomArrayListTest {

    @Test
    public void test1() {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Assert.assertEquals(4, list.size());

        list.remove(1);
        Assert.assertEquals(3, (int) list.get(1));
    }

    @Test
    public void test2() {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        Assert.assertEquals(13, list.size());

        list.remove(2);
        list.remove(6);
        list.remove(4);
        Assert.assertEquals(1, (int) list.get(0));
        Assert.assertEquals(5, (int) list.get(3));
        Assert.assertEquals(10, (int) list.get(6));
        Assert.assertEquals(10, list.size());
    }

    @Test
    public void test3() {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Assert.assertEquals(5, list.size());

        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        Assert.assertEquals(13, list.size());

        list.remove(2);
        list.remove(6);
        list.remove(4);

        Assert.assertEquals(10, list.size());

        list.add(null);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(15);
        Assert.assertEquals(15, list.size());
        Assert.assertNull(list.get(10));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test4() {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.get(3);
    }
}
