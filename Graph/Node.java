public class Node {
	private int index; // the index of this node
	private Node next; // next node

	// basic constructor
	public Node() {
		this.index = 0;
		this.next = null;
	}
	// parameterised constructor
	public Node(int index) {
		this.index = index;
		this.next = null;
	}
	// assessor
	public int getIndex() {
		return this.index;
	}
	public Node getNext() {
		return this.next;
	}
	// mutator
	public void setIndex(int index) {
		this.index = index;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	// Print the data (the index) saved in the node
	public void printNode() {
		System.out.print("Node " + getIndex() + " -> ");
	}
}