package com.java.datastructure;

import java.util.Scanner;

public class OrderedLinkedList {
	 class Node {
	        int data;
	        Node ref;
	 
	        public Node(int data)
	        {
	            this.data = data;
	           
	        }
	    }
	 public Node head = null;
	 public Node tail = null;
	 /*
	  * Method For Adding the Node
	  */
	 public void addNode(int data)
	    {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	 
	            /*
	             *  newNode will be added after tail such that tail's next will point to newNode
	             */
	            tail.ref = newNode;
	            tail = newNode;
	        }
	    }
	 public void sortList()
	    {
	 
	        // Node current will point to head
	        Node current = head, index = null;
	 
	        int temp;
	 
	        if (head == null) {
	            return;
	        }
	        else {
	            while (current != null) {
	                /*
	                 *  Node index will point to node next current
	                 */
	                index = current.ref;
	 
	                while (index != null) {
	                  /*
	                   *    If current node's data is greater than index's node data, swap the data between them
	                   */
	                    if (current.data > index.data) {
	                        temp = current.data;
	                        current.data = index.data;
	                        index.data = temp;
	                    }
	 
	                    index = index.ref;
	                }
	                current = current.ref;
	            }
	        }
	    }
	  public Node search(int data) {
	        Node temp = head;
	        if (head == null) {
	            return null;
	        }
	        while (temp != null) {
	            if (temp.data == data) {
	                return temp;
	            }
	            temp = temp.ref;
	        }
	        return null;
	    }

	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.ref = newNode;
	            tail = newNode;
	        }}
	 public Boolean delete(int data) {
	        Node deleteNode = search(data);
	        Node temp = head;
	        Node node = new Node(data);
	        while (temp != null) {
	            if (temp.ref.equals(deleteNode)) {
	                temp.ref = deleteNode.ref;
	                deleteNode.ref = null;
	                return true;
	            }
	            temp = temp.ref;
	        }
	        return false;
	    }
	  /*
	   * Print the nodes
	   */
	    public void display()
	    {
	        Node current = head;
	 
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.ref;
	        }
	 
	        System.out.println();
	    }
	 
	    public static void main(String[] args)
	    {
	    	   Scanner input = new Scanner(System.in);
	    	OrderedLinkedList List = new OrderedLinkedList();
	 
	        // Adds data to the list
	    	List.addNode(18);
	    	List.addNode(12);
	    	List.addNode(6);
	    	List.addNode(2);
	    	List.addNode(1);
	    	List.addNode(13);
	 
	        /*
	         * Displaying original list
	         */
	        System.out.println("Original list of data are: ");
	        List.display();
	 
	        /*
	         *  Sorting list
	         */
	        List.sortList();
	 
	        /*
	         *  Displaying sorted list
	         */
	        System.out.println("Sorted list of data are: ");
	        List.display();
	    
	    System.out.println("Enter number want to search and delete: ");
        int number = input.nextInt();
        if(List.search(number) != null){
        	List.delete(number);
        	List.display();
        }
        else {
        	List.addNode(number);
        	List.sortList();
        	List.display();
        }
}}
