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
		System.out.print(newNode.data + " ");
	}
	/*
	 * Uc-2
	 * Method Name:addFirst
	 * Logic for adding Data to the first like 
	 * 70
     * 30=>70
     * 56=>30=>70
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.ref = head;
		head = newNode;
	}
	/*
	 * Logic for displaying the added elements
	 */
	public void display() {
		if (head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.ref != null) {
					System.out.print(temp.data + "=>");
				} else
					System.out.println(temp.data);
				temp = temp.ref;
			}
		}
	}
	
	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Linked List program");
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();
	}

}
