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
			head.next = new Node<T>(d, head, head);
			head.prev = head.next;
			size++;
		}
		else{
			current = head.next;
			for(int i = 0; i<size; i++){
				if((current.data == null && current != head)){
					current = new Node<T>(d, current, current.next);
					break;
				}
				else if(current.data != null && current.data.compareTo(d)>0){
					current = new Node<T>(d,current,current.next);
					break;
				}
				current = current.next;
			}
			size++;
		}
				
	}

	public String toString(){
		String output = "";
		Node<T> temp = head.next;
		for (int i = 0; i<size; i++){			
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
