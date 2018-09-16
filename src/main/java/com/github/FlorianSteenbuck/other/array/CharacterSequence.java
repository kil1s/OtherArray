package com.github.FlorianSteenbuck.other.array;

public class CharacterSequence extends ArrayPrototype<Character> implements CharSequence {
    public CharacterSequence() {
        super(new Character[0]);
    }

    protected CharacterSequence(Character[] characters) {
        super(characters);
    }

    @Override
    public CharacterSequence subarray(int from, int to) {
        return new CharacterSequence(ArrayUtil.subarray(array, from, to));
    }

    public void trimLeft() {
        array = ArrayUtil.trimLeft(array);
    }

    public void trimRight() {
        array = ArrayUtil.trimRight(array);
    }

    public void trim() {
        array = ArrayUtil.trim(array);
    }

    public void strip() {
        array = ArrayUtil.strip(array);
    }

    public void rstrip() {
        array = ArrayUtil.rstrip(array);
    }

    public void lstrip() {
        array = ArrayUtil.lstrip(array);
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int i) {
        return array[i];
    }

    @Override
    public CharacterSequence subSequence(int i, int i1) {
        return new CharacterSequence(ArrayUtil.subarray(array, i, i1));
    }

    @Override
    public String toString() {
        char[] chars = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            chars[i] = array[i];
        }
        return new String(chars);
    }
}
