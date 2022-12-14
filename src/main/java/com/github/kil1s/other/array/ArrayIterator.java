package com.github.kil1s.other.array;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    protected T[] array;
    protected int i = 0;

    protected ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return i < array.length;
    }

    @Override
    public T next() {
        i++;
        return array[i];
    }

    public void remove() {
        /* dummy */
    }
}
