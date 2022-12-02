import java.util.NoSuchElementException;

/**
 * @author Jiwon Lee
 * Queue(FIFO 구조)
 * - add() : 맨 뒤에 데이터를 넣음
 * - remove() : 맨 앞의 데이터를 꺼냄
 * - peek() : 맨 앞의 데이터를 조회
 * - isEmpty() : 큐가 비었는지 확인
 */
public class Queue<T> {
	class Node<T>{
		private T data;//노드의 데이터
		private Node<T> next;//현재 노드의 아래 노드
		
		public Node(T data) {
			this.data = data;
		}
	}
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		if(last!=null) {//큐에 노드가 있는 경우 - 마지막 노드의 다음 노드로 설정
			last.next = t;
		}
		last = t;//t를 마지막 노드로 변경
		if(first==null) {//이전 노드가 없는 경우  - 마지막 노드를 첫 노드로 설정
			first=last;
		}
	}
	
	public T remove() {
		if(first==null) {//큐가 비어있는 경우
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		if(first==null) {//큐가 비어있는 경우
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
