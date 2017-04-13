public class tester{
	public static void main(String[] args){
		DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
		System.out.println(test.getHead());
		test.insert(3);
		test.insert(4);
		test.insert(5);
		test.insert(2);
		System.out.println(test.toString());
	}
}
