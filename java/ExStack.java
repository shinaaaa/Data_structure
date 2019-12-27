import java.util.*;

public class ExStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    /* Stack에 값을 저장 */
    System.out.println("Stack에 값을 저장");
    for (int i = 0; i < 10; i++) {
      stack.push(i);
    }

    /* Stack의 크기 확인 */
    System.out.println("Stack의 크기 : " + stack.size());

    /* Stack의 맨위에 값을 꺼냄 꺼낸 값은 지워지지않음 */
    System.out.println("Stack의 값을 꺼냄 : " + stack.peek());

    /* Stack에서 값을 꺼내면서 값을 지움 */
    System.out.println("Stack에서 값을 꺼내면서 값을 지움");
    for (int i = 0; i < 10; i++) {
      if (stack.size() == 10) {
        System.out.print("[ ");
      }
      System.out.print(stack.pop() + ", ");
      if (stack.size() == 0) {
        System.out.println("] ");
      }
    }

    /* Stack의 크기 확인 */
    System.out.println("Stack의 크기 : " + stack.size());
  }
}