package datastructure;

public class CustomArrayList<T> {

    private T[] data;
    private int size;
    private static final int SIZE_FACTOR = 10;
    private int cursor;

    public CustomArrayList() {
        this.data = (T[]) new Object[SIZE_FACTOR];
        this.size = SIZE_FACTOR;
    }

    public void add(T object) {
        if (this.cursor == size) {
            T[] tempData = (T[]) new Object[this.size + SIZE_FACTOR];

            int tempCursor = 0;
            for (int i = 0; i < this.data.length; i++) {
                tempData[i] = this.data[i];
                tempCursor++;
            }
            this.data = tempData;

            this.data[tempCursor] = object;
            tempCursor++;

            this.cursor = tempCursor;
            this.size += SIZE_FACTOR;

        } else {
            this.data[this.cursor] = object;
            this.cursor++;
        }

    }

    public T get(int index) {
        if (index < 0 || index > cursor - 1) {
            throw new ArrayIndexOutOfBoundsException("index out of bound!");
        }
        return this.data[index];
    }

    public void remove(int index) {
        if (index < 0 || index > cursor - 1) {
            throw new ArrayIndexOutOfBoundsException("index out of bound!");
        }
        for (int i = index; i < this.data.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.cursor--;
    }

    public int size() {
        return cursor;
    }
}
