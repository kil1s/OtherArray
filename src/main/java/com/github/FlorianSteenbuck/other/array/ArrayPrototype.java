package com.github.FlorianSteenbuck.other.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayPrototype<T> implements Iterable<T> {
    protected T[] array;
    
    protected ArrayPrototype(T[] array) {
        this.array = array;
    }

    public void lstrip(T[] toStrip) {
        array = ArrayUtil.lstrip(array, toStrip);
    }

    public void rstrip(T[] toStrip) {
        array = ArrayUtil.rstrip(array, toStrip);
    }

    public void strip(T[] toStrip) {
        array = ArrayUtil.strip(array, toStrip);
    }

    public int indexOf(T searchValue) {
        return ArrayUtil.indexOf(array, searchValue);
    }

    public int indexOf(T searchValue, int startIndex) {
        return ArrayUtil.indexOf(array, searchValue, startIndex);
    }

    public int lastIndexOf(T searchValue) {
        return ArrayUtil.lastIndexOf(array, searchValue);
    }

    public int lastIndexOf(T searchValue, int startIndex) {
        return ArrayUtil.lastIndexOf(array, searchValue, startIndex);
    }

    public ArrayPrototype<T> subarray(int from, int to) {
        return new ArrayPrototype<T>(ArrayUtil.subarray(array, from, to));
    }
    
    public void splice(int start) {
        array = ArrayUtil.splice(array, start);
    }

    public void splice(int start, final int deleteCount) {
        array = ArrayUtil.splice(array, start, deleteCount);
    }

    public void splice(int start, final int deleteCount, final T ... items) {
        array = ArrayUtil.splice(array, start, deleteCount, items);
    }

    public void push(T ch) {
        array = ArrayUtil.push(array, ch);
    }

    public void append(T ch) {
        array = ArrayUtil.append(array, ch);
    }

    public Iterator<T> iterator() {
        return new ArrayIterator<T>(array);
    }

    public T[] plain() {
        return array;
    }

    public List<T> asList() {
        return Arrays.asList(array);
    }
}
