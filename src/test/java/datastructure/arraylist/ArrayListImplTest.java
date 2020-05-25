package datastructure.arraylist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayListImplTest {

    private Random random = new Random();

    @Test
    public void test1() {
        ArrayListImpl<Integer> list = new ArrayListImpl<Integer>();
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
        ArrayListImpl<Integer> list = new ArrayListImpl<Integer>();
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
        ArrayListImpl<Integer> list = new ArrayListImpl<Integer>();
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
        ArrayListImpl<Integer> list = new ArrayListImpl<Integer>();
        list.get(3);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test5() {
        ArrayListImpl<Integer> list = new ArrayListImpl<Integer>();
        list.add(1);
        list.get(1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test6() {
        ArrayListImpl<String> list = new ArrayListImpl<String>();
        list.add(null);
        list.get(1);
    }

    @Test()
    public void test7() {
        int randomNumber = random.nextInt(10000) + 10000;
        ArrayListImpl<Integer> list = new ArrayListImpl<Integer>();
        for (int i = 0; i < randomNumber; i++) {
            list.add(i);
        }
        Assert.assertEquals(randomNumber, list.size());
    }

    @Test(timeout = 1000)
    public void test8() {
        int randomNumber = random.nextInt(100000) + 100000;
        ArrayListImpl<Integer> list = new ArrayListImpl<Integer>();
        for (int i = 0; i < randomNumber; i++) {
            list.add(i);
        }
        Assert.assertEquals(randomNumber, list.size());

        int extractNumber = random.nextInt(10000) + 10000;
        for (int i = 0; i < extractNumber; i++) {
            list.remove(i);
        }
        Assert.assertEquals(randomNumber - extractNumber, list.size());
    }

}
