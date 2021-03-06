package Assignment2;

public class QuestionSevenLength {
	
		 private Node head;
		 
	class Node {
		 public int data;
		 public Node next;
		 
		 public void displayNodeData() {
		  System.out.println("{ " + data + " } ");
		 }
		}
		 
		 public boolean isEmpty() {
		  return (head == null);
		 }
//==================================================================	 
		 // used to insert a node at the start of linked list
		 public void insertFirst(int data) {
		  Node newNode = new Node();
		  newNode.data = data;
		  newNode.next = head;
		  head = newNode;
		 }
//==================================================================	 		 
// to find length of linked list using iterative method
		public int lengthOfLinkedList()
		{
		   Node temp=head;
		   int count = 0;
		   while(temp!=null)
		   {
		  temp=temp.next;
		  count++;  
		   }
		    return count;
		}
//==================================================================	 
// or to Find length of linked list using recursion 
		public int LinkedlistLength(Node head)
		 {
		   Node temp=head;
		   if(temp==null)
		   {
		      return 0;
		    }
		   else
		   {
		      return 1+ LinkedlistLength(temp.next);
		    }
		}
//==================================================================	
// used to delete node from start of linked list
		 public Node deleteFirst() {
		  Node temp = head;
		  head = head.next;
		  return temp;
		 }
		 
		 // used to delete node from start of linked list
		 public Node deleteFirst(Node node) {
		  Node temp = head;
		  head = head.next;
		  return temp;
		 }
		 
		 // Use to delete node after particular node
		 public void deleteAfter(Node after) {
		  Node temp = head;
		  while (temp.next != null && temp.data != after.data) {
		   temp = temp.next;
		  }
		  if (temp.next != null)
		   temp.next = temp.next.next;
		 }
		 
		 // used to insert a node at the start of linked list
		 public void insertLast(int data) {
		  Node current = head;
		  while (current.next != null) {
		   current = current.next; // we'll loop until current.next is null
		  }
		  Node newNode = new Node();
		  newNode.data = data;
		  current.next = newNode;
		 }
		 
		 // For printing Linked List
		 public void printLinkedList() {
		  System.out.println("Printing LinkedList (head --> last) ");
		  Node current = head;
		  while (current != null) {
		   current.displayNodeData();
		   current = current.next;
		  }
		  System.out.println();
		 }
		
		public static void main(String args[])
		 {
			QuestionSevenLength mylist = new QuestionSevenLength();
			mylist.insertFirst(15);
			mylist.insertFirst(4);
			mylist.insertFirst(12);
			mylist.insertFirst(10);
			mylist.insertLast(3);
			mylist.printLinkedList();
		
		   System.out.println("Length of Linked List using iteration: "+mylist.lengthOfLinkedList());
		 
		 }
		}
	 
		 