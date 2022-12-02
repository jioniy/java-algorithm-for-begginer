import java.util.EmptyStackException;
/**
 * @author Jiwon Lee
 * Stack (LIFO ����)
 * - pop() : ���� ������ ��� ��ȯ �� ���ÿ��� ����
 * - push() : ��� �߰�
 * - peek() : ���� ������ ��� ��ȯ
 * - isEmpty() : ������ ������� ��ȯ
 */
public class Stack<T> {
	class Node<T>{
		private T data;//����� ������
		private Node<T> next;//���� ����� �Ʒ� ���
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top; // ���� ���� �ִ� ���(last ����)
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		
		T item = top.data;//���� ���� �ִ� ���(top) ������ ���
		top = top.next; // ���� ��ġ�� �ִ� ���(top-1)�� ���� ���� �ִ� ���(top)�� ����� ��
		
		return item;
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;//���� ������ ��� �������� top ��带 ��ġ
		top = t; // ���� ������ ��带 top ���� ����
	}
	
	public T peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
}
