package utilEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStackEx {
/*
 * Queue구조 : FIFO구조. 이를 구현한 클래스가 LinkedList이기에 위 클래스의 객체를 이용해
 * 아래 메서드를 호출하면 자동으로 큐 구조로 이루어진다.
 * 
 * 대표적 메서드 몇가지.
 * element() : 삭제 없이 저장된 요소 리턴. peek과 다른 점은 큐가 비었을 때 예외를 발생시킨다.
 * peek() : null만 리턴한다.
 * 
 * offer(Object obj) : 큐에 객체를 저장. 리턴은 tf
 * peek() : 삭제없이 큐의 가장 우선순위의 요소에 Ref만 리턴. 비어있다면 null 리턴
 * poll() : 큐에서 출구 바로 전에 있는 요소 리턴 및 삭제
 * remove() : 큐에서 출구 바로 전에 있는 요소 가져온다. 비었으면 예외 발생
 */
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("==== Queue값 출력 ------------");
		//Collection타입에 요소가 있는지 여부를 확인하는 isEmpty()를 호출해 없을 때까지 루프를 돌린다.
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			
		}
		//Stack 자료구조 구현 예
		Stack<String> stack = new Stack<String>();
		
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
