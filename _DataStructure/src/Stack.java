import java.util.EmptyStackException;
/**
 * @author Jiwon Lee
 * Stack (LIFO 구조)
 * - pop() : 제일 마지막 노드 반환 후 스택에서 제거
 * - push() : 노드 추가
 * - peek() : 제일 마지막 노드 반환
 * - isEmpty() : 스택이 비었는지 반환
 */
public class Stack<T> {
	class Node<T>{
		private T data;//노드의 데이터
		private Node<T> next;//현재 노드의 아래 노드
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top; // 제일 위에 있는 노드(last 역할)
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		
		T item = top.data;//제일 위에 있는 노드(top) 데이터 백업
		top = top.next; // 다음 위치에 있는 노드(top-1)를 제일 위에 있는 노드(top)로 만들어 줌
		
		return item;
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;//새로 생성한 노드 다음으로 top 노드를 위치
		top = t; // 새로 생성한 노드를 top 노드로 설정
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
