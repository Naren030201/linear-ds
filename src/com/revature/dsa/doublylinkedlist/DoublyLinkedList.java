package com.revature.dsa.doublylinkedlist;

public class DoublyLinkedList<T> {
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
			node.setPrevious(tail);
			tail = node;
		}
		size++;
	}
	
	public T get(int index) {
		return null;
	}
	
	public boolean contains(T data) {
		return false;
	}

	public void insert(int index, T data) {
		
	}
	
	public void update(int index, T data) {
		
	}
	
	public void delete(int index) {
		
	}
	
	public String toString() {
		Node<T> pointer = head;
		String list = "";
		while (pointer != null) {
			list += pointer;
			pointer = pointer.getNext();
		}
		return list;
	}
	
	public static void main(String args[]) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
	}
}
