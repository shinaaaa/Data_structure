import java.util.*;

public class ExLinkedList {
  public static void main(String[] args) {

    /* LinkedList 선언 */
    LinkedList<String> linkedlist = new LinkedList<String>();

    /* LinkedList에 값을 저장 */
    linkedlist.add(0, "피카츄");
    linkedlist.add(1, "파이리");
    linkedlist.add(2, "이상해씨");
    linkedlist.add(3, "꼬부기");

    /* LinkedList 값 출력 */
    System.out.println("LinkedList 값 출력  : " + linkedlist);

    /* LinkedList 3번째에 값을 추가 */
    linkedlist.add(2, "망나뇽");

    /* LinkedList 값 출력 */
    System.out.println("LinkedList 값 출력  : " + linkedlist);

    /* LinkedList 1번째에 값을 변경 */
    linkedlist.set(1, "리자몽");
    /* LinkedList 값 출력 */
    System.out.println("LinkedList 값 출력  : " + linkedlist);
  }
}