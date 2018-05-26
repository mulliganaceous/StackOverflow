package m2APR;

public class Node<T> {
	Node<T> prev;
	T value;
	Node<T> next;
	
	public Node(T value) {
		this.value = value;
		this.prev = null;
		this.next = null;
	}
	
	public void add(T value) {
		Node<T> new_node = new Node<T>(value);
		
		Node<T> cur_node = this;
		while(cur_node.next != null) {
			cur_node = cur_node.next;
		}
		
		cur_node.next = new_node;
		new_node.prev = cur_node;
	}
	
	public void output() {
		Node<T> cur_node = this;
		while(cur_node.next != null) {
			System.err.print(cur_node.value + " -> ");
			cur_node = cur_node.next;
		}
		System.err.println();
		while(cur_node != null) {
			System.err.print(cur_node.value + " -> ");
			cur_node = cur_node.prev;
		}
		System.err.println();
		return;
	}
	
	public static Node<Integer> reverse(Node<Integer> head1) {
		// Base case
		if (head1 == null || head1.next == null)
			return head1;
		Node<Integer> ret_node = null;
		Node<Integer> new_head = head1.next;
		// Iterative case, send next node all the way back to beginning
		// relative to original head, head1
		while(head1.next != null) {;
			System.err.println(head1.next.value);
			// Move next node all the way to beginning
			Node<Integer> cur_prev = head1;
			while (cur_prev.prev != null) {
				cur_prev = cur_prev.prev;
				System.err.println(cur_prev);
			}
			cur_prev.prev = head1.next;
			
			// After moving node after head to beginning
			head1.next = head1.next.next;
		}
		return ret_node;
	}
	
 	public static void main(String[] args) {
		Node<Integer> randNode = new Node<Integer>(0);
		for (int k = 1; k <= 12; k++) {
			randNode.add(k);
		}
		randNode.output();
		Node<Integer> newHead = reverse(randNode);
		newHead.output();
	}
}
