package com.java.linkedlist;
/**
 *  Class to create LinkedList with different methods
 */
public class LinkedList {
	Node head;
/*
 * Without LinkedList node can't exists so thats why  inside LinkedList  Class we created Node class
 */
	class Node {
		Object data;
		Node ref;
		/*
		 * Declare Parameterized constructor
		 */
		Node(Object data) {
			this.data = data;
		}
	}
	/*Uc-1
	 * Method Name:Elements
	 * Logic for creating the simple LinkedList
	 */
	public void elements(Object data) {
		Node newNode = new Node(data);
		System.out.print(newNode.data+" ");
	}
	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Linked List program");
		LinkedList list =new LinkedList();
		list.elements(56);
		list.elements(30);
		list.elements(70);
	}

}
