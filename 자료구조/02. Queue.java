import java.util.NoSuchElementException;

/**
 * @author Jiwon Lee
 * Queue(FIFO ����)
 * - add() : �� �ڿ� �����͸� ����
 * - remove() : �� ���� �����͸� ����
 * - peek() : �� ���� �����͸� ��ȸ
 * - isEmpty() : ť�� ������� Ȯ��
 */
public class Queue<T> {
	class Node<T>{
		private T data;//����� ������
		private Node<T> next;//���� ����� �Ʒ� ���
		
		public Node(T data) {
			this.data = data;
		}
	}
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		if(last!=null) {//ť�� ��尡 �ִ� ��� - ������ ����� ���� ���� ����
			last.next = t;
		}
		last = t;//t�� ������ ���� ����
		if(first==null) {//���� ��尡 ���� ���  - ������ ��带 ù ���� ����
			first=last;
		}
	}
	
	public T remove() {
		if(first==null) {//ť�� ����ִ� ���
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		if(first==null) {//ť�� ����ִ� ���
			last=null;
		}
		return data;
	}
	
	public T peek() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
}
