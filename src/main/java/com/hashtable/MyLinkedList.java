package com.hashtable;

public class MyLinkedList<K> {
	public INode head;
	public INode tail;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void addAtFront(INode<K> node) {
		if(head==null) {
			this.head=node;
			this.tail=node;
		}
		else {
			node.setNext(head);
			this.head=node;
		}
	}
	
	public void addAtEnd(INode<K> node) {
		if(head==null) {
			this.head=node;
			this.tail=node;
		}
		else {
			tail.setNext(node);
			tail=tail.getNext();
		}
	}
	 
	public void insertAtMiddle(INode<K> node) {
		if(head==null) {
			this.head=node;
			this.tail=node;
			return;
		}
		int mid=lenList()/2;
		int i=1;
		INode temp=head;
		while(i!=mid) {
			temp=temp.getNext();
			i++;
		}
		INode temp1=temp.getNext();
		temp.setNext(node);
		node.setNext(temp1);
		
	}
	
	public INode<K> pop() {
		if(head==null) {
			return null;
		}
		INode temp=head;
		head=head.getNext();
		temp.setNext(null);
		return temp;
	}
	
	public INode popLast() {
		if(head==null)
			return null;
		INode temp=head;
		while(temp.getNext()!=tail) {
			temp=temp.getNext();
		}
		INode temp1=temp.getNext();
		tail=temp;
		tail.setNext(null);
		return temp1;
		
	}
	
	public <K> INode search(K key) {
		 if(head==null)
			 return null;
		 INode temp=head;
		 while(temp!=null ) {
			 if(temp.getKey().equals(key)) {
				 System.out.println("element is found");
				 return temp;
			 }
			 temp=temp.getNext();
		 }
		 return null;
		 
	}
	
	public void insert(INode node,int key) {
		if(head==null)
			return;
		INode temp=search(key);
		INode temp1=temp.getNext();
		temp.setNext(node);
		node.setNext(temp1);
	}
	
	public void deleteAnode(int key) {
		if(head==null)
			return;
		if(head.getKey().equals(key)) {
			pop();
		return;
		}
		if(tail.getKey().equals(key)) {
			popLast();
		return;
		}
		INode temp=head;
		while(temp!=null) {
			if(temp.getNext().getKey().equals(key)) {
				temp.setNext(temp.getNext().getNext());
				return;
			}
			temp=temp.getNext();
		}
		
		
	}	
	
	
	public int lenList() {
		if(this.head!=null) {
			INode temp=head;
			int count=0;
			while(temp!=null) {
				count++;
				temp=temp.getNext();
			}
			return count;
		}
		else {
			return 0;
		}
	}
	
	public void printList() {
		if(this.head!=null) {
			INode temp=head;
			while(temp!=null) {
				System.out.print(temp.getKey()+ "->");
				temp=temp.getNext();
			}
			System.out.println(" ");
		}
	}
}
