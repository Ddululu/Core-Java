import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class _12_Stack_Queue {

	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","홍지민","신지민","곽지민"};
		Stack<String> stack =new Stack<String>(); //stack은 클래스, 바로 생성이 가능
		Queue<String> queue = new LinkedList<>(); // queue는 인터페이스, 자식객체인 linkedList를 이용해 구현
		for(String element: array) {
			stack.push(element);
			queue.add(element);
		}
		System.out.println("여긴 스택");
		while(!stack.empty()) {
			System.out.print(stack.pop()+"\t");
		}
		System.out.println("\n여긴 큐");
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+"\t");
		}
	}

}
