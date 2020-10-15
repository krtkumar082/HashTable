package com.hashtable;

public class BinarySearchTree<K extends Comparable<K>> {
public INode<K> root;
	
	public BinarySearchTree() {
		this.root=null;
	}
	public void add(K key) {
		this.root=addRecursively(root,key);
	}
	public INode<K> addRecursively(INode<K> currentRoot,K key){
		if(currentRoot==null) {
			currentRoot=new MyBinaryNode<>(key);
			return currentRoot;
		}
		else {
			if(currentRoot.getKey().compareTo(key)>0) 
				currentRoot.setLeft(addRecursively(currentRoot.getLeft(),key));
			else if(currentRoot.getKey().compareTo(key)<0)
				currentRoot.setRight(addRecursively(currentRoot.getRight(),key));
			return currentRoot;
		}
	}
	public INode<K> search(K key){
		return searchRecursively(root,key);
	}
	public INode<K> searchRecursively(INode<K> currentNode,K key){
		if(currentNode==null)
			return null;
		if(currentNode.getKey()==key)
			return currentNode;
		else if(currentNode.getKey().compareTo(key)>0)
			return searchRecursively(currentNode.getLeft(),key);
		else
			return searchRecursively(currentNode.getRight(),key);
	}
	public int getSize() {
		return getSizeRecursively(root);
	}
	public int getSizeRecursively(INode<K> currentRoot) {
		if(currentRoot==null)
			return 0;
		return 1+getSizeRecursively(currentRoot.getLeft())+getSizeRecursively(currentRoot.getRight());
	}
}
