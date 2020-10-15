package com.hashtable;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
	public K key;
	public INode<K> left;
	public INode<K> right;
	
	public MyBinaryNode(K key){
		this.key=key;
		this.left=null;
		this.right=null;
	}

	@Override
	public void setKey(K key) {
		this.key=key;
		
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setLeft(INode left) {
		this.left=left;
	}

	@Override
	public void setRight(INode right) {
		this.right=right;
		
	}

	@Override
	public INode getLeft() {
		return this.left;
	}

	@Override
	public INode getRight() {
		return this.right;
	}
}
