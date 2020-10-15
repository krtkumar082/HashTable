package com.hashtable;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTreeTest {
	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		BinarySearchTree binarySearchTree=new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		
		int size=binarySearchTree.getSize();
		assertTrue(size==3);
	}
}
