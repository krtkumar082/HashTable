package com.hashtable;

public interface INode<K> {
	K getKey();
	void setKey(K key);
	
	//INode getNext();
	//void setNext(INode next);
	
	public void setLeft(INode left);
	public void setRight(INode right);
	
	public INode getLeft();
	public INode getRight();
}
