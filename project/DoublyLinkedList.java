public class DoublyLinkedList<T extends Comparable>{
	
	private Node<T> head;
	private Node<T> current;
	private int size;
	
	public DoublyLinkedList(){
		head = new Node<T>(null, null, null);
		current=null;
		size = 0;
	}

	public DoublyLinkedList(DoublyLinkedList<T> lst){
		head = lst.getHead();
		current = lst.getCurrent();
		size = lst.getSize();
	}

	public void insert(T d){
		if(head.next==null){
			head.next = new Node<T>(d, head, null);
			current = head.next;
			size++;
		}
		else{
			boolean flag = true;
			Node<T> temp = head.next;
			
			while(flag){
				if(temp.next != null && (d.compareTo(temp.next.data) > 0)){
					temp.next = new Node(temp.next.data, temp.next, temp.next.next);
					System.out.println("This part Doesnt work does it?");
				}
				else if(temp.next== null){
					temp.next = new Node(d, temp, null);
					flag = false;
				}
				else{
					temp.next = new Node<T>(d, temp, temp.next);
					flag = false;
					System.out.println("doot");
				} 
				//System.out.println("The loop is here!");
				
			}
		head.next = temp;
		size++;				
		}
	}

	public String toString(){
		String output = "";
		Node<T> temp = head.next;
		while(temp!=null){			
			output = output + temp.data + "-";
			temp = temp.next;
		}
		return output;
	}
	
	public Node<T> getHead(){
		return head;
	}

	public Node<T> getCurrent(){
		return current;
	}

	public int getSize(){
		return size;
	}

	private class Node<T>{
		private T data;
		private Node<T> next;
		private Node<T> prev;

		private Node (T d){
			data = d;
			next=null;
			prev=null;
		}
		
		private Node (T d, Node pref, Node nref){
			data=d;
			next=nref;
			prev=pref;
		}
	}		
}	
