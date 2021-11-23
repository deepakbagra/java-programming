class LinkedList {
	Node head;
	int numNodes;

	// basic constructor
	public LinkedList(){
		this.head = null;
		this.numNodes = 0;
	}
	// parameterised constructor
	public LinkedList(Node head){
		this.head = head;	
	}
	// parameterised constructor
	public LinkedList(Node head, int numNodes){
		this.head = head;
		this.numNodes = numNodes;	
	}
	public void print(){
		if(this.head == null){
			System.out.println("the list is empty");
		}
		else{
			Node tmp = this.head;			
			while(tmp != null){
				tmp.printNode();
				tmp = tmp.getNext();				
			}
			System.out.println();
		}
	}	
	
	// add new node to the tail
	public void addTail(Node newNode){
		// if the list is empty
		if(this.head == null){
			this.head = newNode;
		}
		else{ // traversing the list
			Node tmp = this.head;
			while(tmp.getNext() != null){
				tmp = tmp.getNext();				
			}
			// add new node 	
			tmp.setNext(newNode);			
		}
	}
	// add new node to tail by index
	public void add(int index) {
		addTail(new Node(index));
	}
	// delete a node from the list
	public void delete(int index){
		// if the list is empty
		if(this.head == null){
			// do nothing
		}
		// if the first node is to be deleted
		else if(this.head.getIndex() == index){			
			this.head = this.head.getNext();			
		}
		else{
			Node tmp = this.head; // pointer to the current node
			Node prev = null; // pointer to the previous node 
			// traverse the list until :> find the element or reach the end
			while(tmp != null && tmp.getIndex() != index){
				prev = tmp;
				tmp = tmp.getNext();				
			}
			if(tmp != null){
				prev.setNext(tmp.getNext());
			}
		}
	} 
}	
			