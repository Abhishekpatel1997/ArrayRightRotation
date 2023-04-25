package myarraylist;

import java.util.*;

public class MyArrayList {
	private String[] array;
	private int size;

	public MyArrayList() {
		array = new String[10];
		size = 0;
	}

	public void add(String element) {
		if (size == array.length) {
			doubleArraySize();
		}
		array[size] = element;
		size++;
	}

	public void doubleArraySize() {
		String[] newArray = new String[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

	public void add(int index, String element) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if(size==array.length)
		{
			doubleArraySize();
		}
		for (int i = size; i < index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = element;
		size++;

	}
}