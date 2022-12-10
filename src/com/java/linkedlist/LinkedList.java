package com.java.linkedlist;

import java.util.Scanner;

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
	/*
	 * Method Name:Elements
	 * Logic for creating the simple LinkedList
	 */
	public void elements(Object data) {
		Node newNode = new Node(data);
		System.out.print(newNode.data + " ");
	}
	/*
	 * 
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
	/*Method Name:addLast
	 * Logic for adding data for Last like
	 * 56
	 * 56=>30
     * 56=>30=>70
	 */
	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null)
			head = newNode;
		else {

			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}
	/*
	 * Method Name:addAtposition
	 * Logic for adding the data to inBetween position 
	 */
	public void addAtPosition(Object data, int position) {
		int index = 0;
		Node newNode = new Node(data);
		Node left = head;
		Node right = left.ref;

		/*
		 * position-1 is used because the value of index will be incremented and stops
		 * before the position at which user wants to add the node
		 */
		while (index < (position - 1)) {

			left = left.ref;
			right = right.ref;
			index++;
		}
		/*
		 * if we do index < position is used because the value of index will be
		 * incremented and will point to the index user has entered and the new element
		 * will be added after the entered position
		 */
		newNode.ref = right;
		left.ref = newNode;
	}
	/*
	 * Method Name=deleteFirst
	 * Logic for deleting the first element
	 */
	public void deleteFirst()
	{
		head = head.ref;
	}
	/*
	 *  Method Name=deleteLast
	 *  Logic for deleting the first element
	 */
	public void deleteLast() {

		if (head == null)
			System.out.println("Linked List is Empty");
		else if (head.ref == null)
			head = null;
		else {
			Node temp = head;
			while (temp.ref.ref != null) {
				temp = temp.ref;
			}
			temp.ref = null;
		}
	}
	/*
	 * Method Name:searchElement
	 * Logic for searching a linkedList to find the  node with value 30
	 */
	public Object searchElement(Object input)
	{
		Node temp = head;
		int index =0;
		while(temp != null)
		{
			index++;
			if(temp.data == input)
			{
				
				String res=  temp.data+" found at index "+index;
				
				return res;
			}	
			temp = temp.ref;
		}
		return null;
	}
	/*
	 * Method Name:InsertElement
	 * logic for insert the new data to after the LinkedList Sequence
	 */
	public void insertElement(Object input, Object value) {
		Node newNode = new Node(value);
		Node temp = head;

		int index = 0;
		while (temp.data != input) {
			index++;
			temp = temp.ref;
		}
		Node left = head;
		Node right = left.ref;
		int index1 = 0;
		while (index1 < index) {
			index1++;
			left = left.ref;
			right = right.ref;
		}
		newNode.ref = right;
		left.ref = newNode;
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
		Scanner input = new Scanner(System.in);
		list.addFirst(56);
		list.display();
		list.addLast(70);
		list.display();
		// System.out.println("Enter position after which you want to add node: ");
		System.out.println("Enter position at which you want to add node: ");
		int position = input.nextInt();
		list.addAtPosition(30, position);
		list.display();
		System.out.println("Enter element to search in linked list: ");
		int element = input.nextInt();
		System.out.println(list.searchElement(element));
		System.out.println("Enter element after which you want to add: ");
		int data = input.nextInt();
		System.out.println("Enter value to add: ");
		int value = input.nextInt();
		list.insertElement(data, value);
		list.display();
	}

}
