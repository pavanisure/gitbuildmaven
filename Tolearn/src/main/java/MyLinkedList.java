public class MyLinkedList {
	public int value;
	LinkedListNode head;
    
	public MyLinkedList(int headValue) {
		head = new LinkedListNode();
		head.element=headValue;
		head.next=null;
    }
	
	public void add(int newNodeElement) {
		LinkedListNode newNode = new LinkedListNode();
		newNode.element=newNodeElement;
		newNode.next=null;
		newNode.prev=head;
		head=newNode;
		//System.out.println(newNodeElement );
	}
	public int getElement(int position) {
		int i=0;
		while(head.prev!=null) {
			head = head.prev;
		}
		while(i<position) {
			head=head.next;
			i++;
		}
		//System.out.println(head.element);
		return head.element;
	}
	public int getElementInReverseOrder(int position) {
		int i=0;
		while(head.next!=null) {
			head=head.next;
		}
		System.out.println(head.element);
		while(i<position) {
			head=head.prev;
			i++;
		}
		return head.element;
	}
	
	public void remove(int element) {
		while(head!=null) {
			if(head.element==element) {
				head.prev.next=head.next;
			}
			head=head.next;
		}
	}

	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList(1);
		l.add(2);
		l.add(3);
		l.add(4);
		//l.getElement(2);
		System.out.println(l.getElementInReverseOrder(2));
		
		

	}

}
