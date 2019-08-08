package com.zc;

import java.util.Arrays;

public class MyArraryList implements MyList {
	//数组默认大小
	private static final int DEFAULT_CAPACITY = 2;
	Object[] elementData;
	int size;
	

	public MyArraryList() {
		new MyArraryList(DEFAULT_CAPACITY);
	}

	public MyArraryList(int size) {
		elementData = new Object[size];
	}

	public Object[] getElementData() {
		return elementData;
	}

	public void setElementData(Object[] elementData) {
		this.elementData = elementData;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public boolean add(Object o) {
		if(size==DEFAULT_CAPACITY) {
			Object [] newelementData  =Arrays.copyOf(elementData, size>>2);
		}
		elementData[size++] = o;
		System.out.println("siez="+size);
		return true;
	}

	@Override
	public boolean add(int index, Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
