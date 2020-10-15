package com.hashtable;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTreeTest {
	@Test
	public void given13NumbersWhenAddedToBinaryTreeShouldReturnSize13() {
		BinarySearchTree binarySearchTree=new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);
		
		int size=binarySearchTree.getSize();
		assertTrue(size==13);
	}
	
	@Test
	public void givenBSTWith13NodeSearchNodeWithKey63ShouldReturnThatNode() {
		BinarySearchTree binarySearchTree=new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);
		
		INode returnedNode=binarySearchTree.search(63);
		assertTrue(returnedNode.getKey().equals(63));
	}

	
}
