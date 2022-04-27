package com.revature.dsa.singlylinkedlist;

import com.revature.dsa.doublylinkedlist.Node;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	public T get(int index) {
		if (index >= size) {
			return null;
		}
		Node<T> pointer = head;
		for (int i = 0; i < index; i++) {
			pointer = pointer.getNext();
		}
		return pointer.getData();
	}

	public boolean contains(T data) {
		Node<T> pointer=head;
		for(int i=0;i<size;i++) {
			if(pointer.getData().equals(data)) {
				return true;
			}
			pointer=pointer.getNext();
		}
		return false;
	}

	public void insert(int index, T data) {

	}

	public void update(int index, T data) {
		Node<T> pointer = head;
		for (int i = 0; i < index; i++) {
			pointer = pointer.getNext();
		}
		pointer.setData(data);
	}

	public void delete(int index) {

	}

	public String toString() {
		Node<T> pointer = head;
		String result = "";
		for (; pointer != null; pointer = pointer.getNext()) {
			result += pointer.toString();
		}
		return result;
	}
}
