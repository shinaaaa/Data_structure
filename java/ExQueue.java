import java.util.*;

public class ExQueue {
  public static void main(String[] args) {
    /* LinkedList queue = new LinkedList(); */
    Queue<Integer> queue = new LinkedList<Integer>();

    /* Queue에 값을 저장 */
    System.out.println("Queue에 값을 저장");
    for (int i = 0; i < 10; i++) {
      /* queue.add(i); */
      queue.offer(i);
    }
    /* Queue의 크기 확인 */
    System.out.println("Queue의 크기 : " + queue.size());
    /*
     * Queue에서 맨앞에 값을 꺼냄 꺼낸 값은 지워지지않음
     */
    System.out.println("Queue에서 맨앞에 값을 꺼냄 꺼낸 값은 지워지지않음");
    System.out.println(queue.peek());

    /* Queue에서 값을 꺼내면서 값을 지움 */
    System.out.println("Queue에서 값을 꺼내면서 값을 지움");
    for (int i = 0; i < 10; i++) {
      if (queue.size() == 10) {
        System.out.print("[ ");
      }
      System.out.print(queue.poll());
      System.out.print(", ");
      if (i == 9) {
        System.out.println("] ");
      }
    }
    /* Queue의 크기 확인 */
    System.out.println("Queue의 크기 확인 : " + queue.size());
  }
}