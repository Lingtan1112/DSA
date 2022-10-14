package com.linear;

public class SingleLinkedList {
	
	Node headNode;
	
	public void insert(Object data) {
		Node newNode = new Node();
		newNode.setData(data);
		if(headNode==null) {
			headNode = newNode;
		}else {
			Node tempNode = headNode;
			while(tempNode.getNextElement()!= null) {
				tempNode = tempNode.getNextElement();
			}
			tempNode.setNextElement(newNode);
		}
	}
	
	public void show() {
		
		Node node = headNode;
		while(node.getNextElement()!=null) {
			System.out.println(node.getData());
			node = node.getNextElement();
		}
		System.out.println(node.getData());
		
	}

}
